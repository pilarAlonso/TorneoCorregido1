package com.company;

public class Carry extends Jugador {
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getApellidos() {
        return super.getApellidos();
    }

    @Override
    public void setApellidos(String apellidos) {
        super.setApellidos(apellidos);
    }

    @Override
    public int getRapidez() {
        return super.getRapidez();
    }

    @Override
    public void setRapidez(int rapidez) {
        super.setRapidez(rapidez);
    }

    @Override
    public int getIngenio() {
        return super.getIngenio();
    }

    @Override
    public void setIngenio(int ingenio) {
        super.setIngenio(ingenio);
    }

    public Carry() throws Excepcion {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double ELO() {
        return super.getIngenio() * 3 + super.getRapidez() * 0.2;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
