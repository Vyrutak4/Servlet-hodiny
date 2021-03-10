import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/timezone")
public class MyServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    res.setContentType("text/html;charset=utf-8");
    PrintWriter out = res.getWriter();
    out.println("<html><body>");
	int x =  Integer.parseInt(req.getParameter("year"));
	int j = x/1000;
	x = x%1000;
	int k = x/100;
	x = x%100;
	int l = x/10;
	x = x%10;
	int m = x;
	
	long i = j*k*l*m;
	
    out.println("<p>" + i + "<p>");
    out.println("</body></html>");
  }
}
