import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class cookie1 extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
res.setContentType("text/html");
String n = req.getParameter("usr");
String p = req.getParameter("pwd");
PrintWriter out = res.getWriter();
Cookie usr1 = new Cookie("u1","sudha");
Cookie usr2 = new Cookie("u2","seenu");
Cookie usr3 = new Cookie("u3","kumar");
Cookie usr4 = new Cookie("u4","rao");
Cookie pw1 = new Cookie("p1","sudha123");
Cookie pw2 = new Cookie("p2","seenu123");
Cookie pw3 = new Cookie("p3","kumar123");
Cookie pw4 = new Cookie("p4","rao123");
int flag = 0;
String user[] = {usr1.getValue(), usr2.getValue(), usr3.getValue(), usr4.getValue()};
String pwd[] = {pw1.getValue(), pw2.getValue(), pw3.getValue(), pw4.getValue()};
for(int i=0;i<4;i++){
if(user[i].equals(n) && pwd[i].equals(p)){
	flag = 1;
	out.println("Welcome"+n.toUpperCase());
}
}
if(flag==1){
	out.println("Welcome"+n.toUpperCase());
}
else{
	out.println("You are not authenticated user");
}





}
}
