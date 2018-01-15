package com.iesemilidarder.restaurants.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class mostrarrestaurantServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idInformacio = request.getParameter("id");

        ConexionBaseDeDatos conexionBaseDeDatos = new ConexionBaseDeDatos();

        request.setAttribute("idInformacio", conexionBaseDeDatos.readRestaurant2(idInformacio));

        request.getRequestDispatcher("informacion.jsp").forward( request, response );
    }
}