import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class cookie3 extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
String n = req.getParameter("user");
String p = req.getParameter("pwd");
Cookie usr1 = new Cookie("u1", "sudha");
Cookie pw1 = new Cookie("p1", "sudha123");
Cookie usr2 = new Cookie("u2", "seenu");
Cookie pw2 = new Cookie("p2", "seenu123");
int f = 0;
String usr[] = {usr1.getValue(), usr2.getValue()};
String pwd[] = {pw1.getValue(), pw2.getValue()};
for(int i=0;i<2;i++){
if(usr[i].equals(n) && pwd[i].equals(p))
f=1;
}
if(f==1)
out.println("Welcome"+n.toUpperCase());
else
out.println("Sorry");
}
}