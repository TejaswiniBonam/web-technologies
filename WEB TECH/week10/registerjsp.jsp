<%@page import ="java.sql.*" %>
<html>
<head>
<title>JSP</title>
</head>
<body>
<%! String n, p;
int x;
%>
<%
n = request.getParameter("user");
p = request.getParameter("pwd");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?useSSL=false","root","mysql");
String q = "insert into user(username, password) values (?,?)";
PreparedStatement stm = con.prepareStatement(q);
stm.setString(1, n);
stm.setString(2, p);
x = stm.executeUpdate();
System.out.println("Data updated..."+x);
if(x>0)
response.sendRedirect("login.html");
else
out.println("<html>faliure</html>");
con.close();
}
catch(Exception e){
System.out.println(e.getMessage());
}
%>
</body>
</html> 
