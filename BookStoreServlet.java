package Q1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class I228797_Q1_BookServlet extends HttpServlet {

    private List<I228797_Q1_Book> books;

    public void init() throws ServletException {
        super.init();

        // Initialize the list of books
        books = new ArrayList<>();
        books.add(new I228797_Q1_Book("The Lord of the Rings", "JJ Thomson", "Fantasy", 13));
        books.add(new I228797_Q1_Book("The Jumanji", "yousaf", "Action", 10.99));
        books.add(new I228797_Q1_Book("Charlie and the Chocolate Factory", "Willy Wonka", "Fiction", 12.50));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Displaying Book List</title>");
        out.println("<style>");
        out.println("table {");
        out.println("  width: 50%;");
        out.println("  text-align: centre");
        out.println("}");
        out.println("th, td {");
        out.println("  padding: 15px");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome to the Yousaf Book Store!</h1>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>Title</th>");
        out.println("<th>Author</th>");
        out.println("<th>Genre</th>");
        out.println("<th>Price</th>");
        out.println("</tr>");

        for (I228797_Q1_Book book : books) {
            out.println("<tr>");
            out.println("<td>" + book.getTitle() + "</td>");
            out.println("<td>" + book.getAuthor() + "</td>");
            out.println("<td>" + book.getGenre() + "</td>");
            out.println("<td>$" + book.getPrice() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}