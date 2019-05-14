package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Torneo torneo=new Torneo();
        try{
        torneo.generarEquipo();
        System.out.println("los cinco mejores jugadores son:");
        torneo.cincoMejoresJugadores();
        System.out.println("los cinco mejores equipos son:");
        torneo.mejoresCincoEquipos();
        System.out.println("Torneo justo:");
        System.out.println( torneo.torneoJustoEquipos());

    } catch (Excepcion excepcion) {
        System.out.println(excepcion.getMessage());

    }
    }
}
