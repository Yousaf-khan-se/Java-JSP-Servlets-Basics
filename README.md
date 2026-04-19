# Java EE Servlets and JSP

## Description
A basic Java Enterprise Edition (EE) web project demonstrating how to handle HTTP requests and generate dynamic web content using pure Java Servlets and JavaServer Pages (JSP).

## Concepts Demonstrated
* **Servlets:** Extending `HttpServlet`, handling `doGet()` requests, and using `PrintWriter` to generate HTML responses directly from Java.
* **JSP Elements:** Utilizing Scriptlets (`<% %>`), Expressions (`<%= %>`), and Declarations (`<%! %>`) to embed Java logic seamlessly inside HTML.
* **Request Dispatcher:** Forwarding HTTP requests from a Servlet to a JSP page.

## Included Examples
* **Book Store Servlet:** An `HttpServlet` that initializes a list of `Book` objects and dynamically renders them into an HTML table.
* **Calculator JSP:** A Servlet that forwards an incoming request to a `.jsp` file, which calculates and displays the sum and average of hardcoded numbers.

## Setup & Configuration
You will need a Servlet Container like Apache Tomcat. Deploy the project to Tomcat and navigate to the mapped Servlet URLs configured in your deployment descriptor (`web.xml`) or via annotations.
