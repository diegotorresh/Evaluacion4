package com.dtorres.evaluacionapp.Modelo;

public class Mascota {

   private Long id;
   private String Nombres;
   private String Raza;
   private String Edad;
   private String Fto;
   private String Dueño;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    public String getFto() {
        return Fto;
    }

    public void setFto(String fto) {
        Fto = fto;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String dueño) {
        Dueño = dueño;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", Nombres='" + Nombres + '\'' +
                ", Raza='" + Raza + '\'' +
                ", Edad='" + Edad + '\'' +
                ", Fto='" + Fto + '\'' +
                ", Dueño='" + Dueño + '\'' +
                '}';
    }
}
