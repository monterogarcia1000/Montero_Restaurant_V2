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

        Restaurant restaurant = (Restaurant)request.getAttribute("idInformacio");
        out.println(restaurant.getNombre());
        out.println("<p>" + "<img class='img-fluid' src='"+ restaurant.getUrl_imagen() +"'>" + "</p>");
        out.println("<p>" + restaurant.getDireccion() + "</p>");
        out.println("<p>" + restaurant.getTipo() + "</p>");
        out.println("<p>" + restaurant.getTelefono() + "</p>");
        out.println("<p>" + restaurant.getWeb() + "</p>");

        for (String op : restaurant.getOpinions()) {

            out.println("<p>" + op + "</p>");

        }



    %>

</body>
</html>
