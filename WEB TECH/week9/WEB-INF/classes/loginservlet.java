import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class loginservlet extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
String n = req.getParameter("user");
String p = req.getParameter("pwd");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?useSSL=false","root","mysql");
Statement stm = con.createStatement();
ResultSet rs = stm.executeQuery("select * from user where username='"+n+"' and password='"+p+"'");
if (rs.next()){
out.println("Success");
}else{
out.println("Failure");
}
con.close();
}
catch(Exception e){	
System.out.println(e.getMessage());
}
}
}
