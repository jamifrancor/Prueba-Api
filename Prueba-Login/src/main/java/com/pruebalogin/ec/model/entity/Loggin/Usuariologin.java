package com.pruebalogin.ec.model.entity.Loggin;

public class Usuariologin {
     private int Id;
     private String nombreusuario;
     private String contraseña;

    public Usuariologin(int id, String nombreusuario, String contraseña) {
        this.Id = id;
        this.nombreusuario= nombreusuario;
        this.contraseña= contraseña;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
