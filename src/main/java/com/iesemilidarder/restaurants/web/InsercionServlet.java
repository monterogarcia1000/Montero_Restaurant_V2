package com.iesemilidarder.restaurants.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InsercionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Usuari usuari = (Usuari) request.getSession();

        if (usuari != null){

            String insercion = request.getParameter("insercion");

            String id = request.getParameter("id");

            String usuariinser = usuari.getUsuario();

            ConexionBaseDeDatos conexionBaseDeDatos = new ConexionBaseDeDatos();

            request.setAttribute("insercionopi", conexionBaseDeDatos.insercion(insercion, id, usuariinser));


        }

    }
}
