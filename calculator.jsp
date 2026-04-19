<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculation and Average</title>
</head>
<body>
    <h1>Simple Calculations</h1>
    <%-- Scriptlet Tag --%>
    <%
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
    %>

    <%-- Expression Tag --%>
    <p>The sum of <%= num1 %> and <%= num2 %> is: <%= sum %></p>

    <%-- Declaration Tag --%>
    <%!
        double calculateAverage(int num1, int num2) {
            return (double) (num1 + num2) / 2;
        }
    %>

    <%-- Display the Average --%>
    <p>The average of <%= num1 %> and <%= num2 %> is: <%= calculateAverage(num1, num2) %></p>
</body>
</html>