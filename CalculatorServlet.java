package Q2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class I228797_Q2_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Calculation and Average</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Calculate Average</h1>");
        out.println("</body>");
        out.println("</html>");
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/I228797_Q2_calculate.jsp");
        dispatcher.forward(request, response);
    }
}
