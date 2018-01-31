package com.iesemilidarder.restaurants.web;

public class Usuari {

    private String usuario;

    private String contrasenya;

    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usu_nom) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String usu_password) {
        this.contrasenya = contrasenya;
    }

    public Usuari(String usuario, String contrasenya, String mail) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.mail = mail;
    }

}
