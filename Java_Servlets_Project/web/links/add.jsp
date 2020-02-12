<%--
  Created by IntelliJ IDEA.
  User: Kisi_sisi
  Date: 11.02.2020
  Time: 00:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new pizza</title>
</head>
<body>
    <h1>PIZZA ADDING PROCESS. THANKS!</h1>
    <%
        if (request.getAttribute("PizzaName") != null) {
            out.println("<p>Pizza '" + request.getAttribute("PizzaName") + "' added in "+request.getAttribute("PizzaCount")+" examples!</p>");
        }
    %>
    <form method="post">
        <label>New pizza`s name is
            <input type="text" name="name"><br />
        </label>
        <label>Number of new pizza`s is
            <input type="text" name="count"><br />
        </label>
        <button type="submit" onclick="location.href='/'">Submit</button>
    </form>
</body>
</html>
