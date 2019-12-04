package com.dtorres.evaluacionapp.Modelo;

public class Usuario {

    private Long id;
    private String Nombre;
    private String Correo;
    private String Contraseña;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }


    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Correo='" + Correo + '\'' +
                ", Contraseña='" + Contraseña + '\'' +
                '}';
    }
}
