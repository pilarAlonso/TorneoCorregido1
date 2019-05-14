package com.company;

import java.util.Random;

public class GenerarInfoRandom {
    public static String nombre() {
        String nombresRandom[] = {"Francisco", "Alejandro", "Cristina", "Alicia", "Gabriel", "Leo", "Lola", "Eugenia", "Jeremías", "Pablo", "Rodolfo", "Javier"};
        int numero = (int) Math.round(Math.random() * (nombresRandom.length - 1));
        return nombresRandom[numero];

    }

    public static String apellido() {
        String apellidosRandom[] = {"Pérez", "Alonso", "Salazar", "Herrero", "Lopez", "Gil", "Cuevas", "Espejel", "Rufo", "Márquez", "García", "Campos"};
        int numero = (int) Math.round(Math.random() * (apellidosRandom.length - 1));
        return apellidosRandom[numero];


    }

    public static int rapidez() {
        int rapidez = (int) (Math.random() * 100 + 1);

        return rapidez;
    }

    public static int ingenio() {
        int ingenio = (int) (Math.random() * 100 + 1);
        return ingenio;
    }





    public static String nombreEquipo() {
        String nombresRandom[] = {"EquipoA", "EquipoB", "EquipoC", "EquipoD", "EquipoE", "EquipoF", "EquipoG", "EquipoH", "EquipoI", "EquipoJ", "EquipoK", "EquipoL", "Equipo12", "Equipo45", "Equipo1", "EquipoR", "Equipo87", "EquipoAr", "Equipo34", "Equipo123", "Equipo456", "Equipo98", "EquipoKJBN", "EquipoLON"};
        int numero = (int) Math.round(Math.random() * (nombresRandom.length - 1));
        return nombresRandom[numero];

    }
}
