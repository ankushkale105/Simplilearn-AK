import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class NameServlet
*/
@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public NameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                String firstname = request.getParameter("firstname");
                String lastname = request.getParameter("lastname");
                
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<h3>Your full name is " + firstname + " " + lastname + ".</h3>");
            	out.println("</body></html>");
        }

     

}
