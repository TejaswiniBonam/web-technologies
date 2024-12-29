import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class registerservlet extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
String n = req.getParameter("user");
String p = req.getParameter("pwd");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?useSSL=false","root","mysql");
String q = "insert into user(username, password) values (?,?)";
PreparedStatement stm = con.prepareStatement(q);
stm.setString(1, n);
stm.setString(2, p);
int x = stm.executeUpdate();
System.out.println("Data updated..."+x);
if(x>0)
res.sendRedirect("login.html");
else
out.println("<html>faliure</html>");
con.close();
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}