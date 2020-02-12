<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Kisi_sisi
  Date: 11.02.2020
  Time: 00:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Eating out pizzas</title>
</head>
<body>
    <h1>I HAVE ALREADY EATEN OUT WITH THESE PIZZAS. THANKS!</h1>
    <ul>
        <%
            HashMap<String, Integer> data = (HashMap<String, Integer>) request.getAttribute("PizzaNames");
            List<String> names = new ArrayList<>(data.keySet());
            if (!names.isEmpty()) {
                for (String s : names) {
                    out.println("<li>" + s +" "+data.get(s)+ "</li>");
                }
            }
        %>
    </ul>
</body>
</html>
