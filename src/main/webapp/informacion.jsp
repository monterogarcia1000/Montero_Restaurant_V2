<%@ page import="com.iesemilidarder.restaurants.web.ConexionBaseDeDatos" %>
<%@ page import="com.iesemilidarder.restaurants.web.Restaurant" %>
<%@page import="java.util.*" %>
<%@page import="java.lang.String" %>
<%@ page import="com.iesemilidarder.restaurants.web.TestServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%

        out.println("hola");

        Restaurant restaurant = (Restaurant)request.getAttribute("idInformacio");
        out.println(restaurant.getNombre());

    %>

</body>
</html>