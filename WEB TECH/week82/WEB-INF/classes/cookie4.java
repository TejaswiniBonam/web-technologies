import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class cookie4 extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
res.setContentType("text/html");
PrintWriter out = res.getWriter();
String n = req.getParameter("user");
String p = req.getParameter("pwd");
String usr1 = getServletConfig().getInitParameter("u1");
String pw1 = getServletConfig().getInitParameter("p1");
String usr2 = getServletConfig().getInitParameter("u2");
String pw2 = getServletConfig().getInitParameter("p2");
int f = 0;
String usr[] = {usr1, usr2};
String pwd[] = {pw1, pw2};
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