import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* Servlet implementation class Logout
*/
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
  
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                HttpSession session=request.getSession();  
                session.invalidate();           
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
            out.println("<h3>Logged out of session....<br></h3>");
            out.println("<h3>Thank you for your Login<br></h3>");
            out.println("</body></html>");
        }
}