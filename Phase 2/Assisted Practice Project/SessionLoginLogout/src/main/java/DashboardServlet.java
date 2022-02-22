import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* Servlet implementation class Dashboard
*/
@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public DashboardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                  PrintWriter out = response.getWriter();
                    out.println("<html><body>");
                    
                    HttpSession session=request.getSession(false);  
                    String userId = null;
                    if (session.getAttribute("userid") != null)
                        userId =(String)session.getAttribute("userid");  
                    if (userId == null ) {
                        out.println("<h3>No UserId was found in session.<br></h3>");
                    } else {
                        out.println("<h2>UserId obtained from session : " + userId + "<br></h2>");
                        out.println("<a href='logoutservlet'>Logout of session</a><br>");
                    }
                    out.println("</body></html>");
        }
}
