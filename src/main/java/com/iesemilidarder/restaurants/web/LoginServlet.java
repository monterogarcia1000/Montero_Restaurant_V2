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

        String usuari = request.getParameter("usuari");

        String contrasenya = request.getParameter("contrasenya");


        try {

            Usuari usuarii = ConexionBaseDeDatos.Login(usuari , contrasenya);

            request.getSession().setAttribute("usuari", usuarii);

            request.getRequestDispatcher("index.jsp").forward( request, response );

        }catch (Exception e){

            request.setAttribute("error", e.getMessage());

            request.getRequestDispatcher("Login.jsp").forward( request, response );
        }


    }

}
