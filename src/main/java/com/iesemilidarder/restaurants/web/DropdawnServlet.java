package com.iesemilidarder.restaurants.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DropdawnServlet")
public class DropdawnServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String tipores = request.getParameter("tipo");

        ConexionBaseDeDatos conexionBaseDeDatos = new ConexionBaseDeDatos();

        request.setAttribute("tipores", conexionBaseDeDatos.TipoRestaurante(tipores));

        request.getRequestDispatcher("RestauranteXTipo.jsp").forward( request, response );

    }
}
