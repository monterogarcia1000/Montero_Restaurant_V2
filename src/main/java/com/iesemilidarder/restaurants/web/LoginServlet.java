package com.iesemilidarder.restaurants.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String usuari = request.getParameter("usuari");

        String contrasenya = request.getParameter("contrasenya");

        ConexionBaseDeDatos conexionBaseDeDatos = new ConexionBaseDeDatos();

        request.setAttribute("Login", conexionBaseDeDatos.Login(usuari , contrasenya));

        request.getRequestDispatcher("index.jsp").forward( request, response );

    }
}
