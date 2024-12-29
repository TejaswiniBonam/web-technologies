<%@page import ="java.sql.*" %>
<html>
<head>
<title>JSP</title>
</head>
<body>
<%! String n, p;
boolean b;
%>
<%
n = request.getParameter("user");
p = request.getParameter("pwd");
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
%>
</body>
</html>