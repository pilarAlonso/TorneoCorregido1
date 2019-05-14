package com.company;

public class Jugador {
    private String nombre;
    private String apellidos;
    private int rapidez;
    private int ingenio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }

    public int getIngenio() {
        return ingenio;
    }

    public void setIngenio(int ingenio) {
        this.ingenio = ingenio;
    }

    protected Jugador() throws Excepcion {
        this.setNombre(GenerarInfoRandom.nombre());
        this.setApellidos(GenerarInfoRandom.apellido());
        this.setRapidez(GenerarInfoRandom.rapidez());
        this.setIngenio(GenerarInfoRandom.ingenio());


    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", rapidez=" + rapidez +
                ", ingenio=" + ingenio +

                ", ELO=" + ELO() +

                '}';
    }
    public double ELO(){
        double ELO=ingenio*rapidez;
        return ELO;
    }
}
