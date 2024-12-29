import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class bookservlet extends HttpServlet{
public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?useSSL=false","root","mysql");
Statement stm = con.createStatement();
ResultSet rs = stm.executeQuery("select * from books");
out.println("<center> <table border=1>");
out.println("<thead><th>Name</th> <th>Price </th> <th>Quantitiy </th> <th> Amount </th> </thead>");
while(rs.next()){
out.println("<tr> <td> "+rs.getString(1)+"</td>");
double x,y;
x = rs.getInt(2);
out.println("<td>"+x+"</td>");
y = rs.getInt(3);
out.println("<td>"+y+"</td>");
double a = x*y;
out.println("<td>"+a+"</td>");
}
out.println("</table> </center>");
con.close();
}catch(Exception e){System.out.println(e.getMessage()); }
}
}