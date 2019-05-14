package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Torneo {
    private List<Equipo> listaTotalEquipos = new ArrayList<>(20);
    private boolean esPar(int n) {
        boolean par;
        if (n % 2 == 0) {
            par = true;
        } else {
            par = false;
        }
        return par;
    }

    protected StringBuffer torneoJustoEquipos() {

       StringBuffer torneos = new StringBuffer();
        listaTotalEquipos.sort((x, y) -> Double.compare(y.ELOtotalEquipo(), x.ELOtotalEquipo()));

        for (int i = 0; i < listaTotalEquipos.size(); i++) {
            if (esPar(i)) {
                torneos.append(listaTotalEquipos.get(i));
                torneos.append("||");
                torneos.append("ELO = ");
                torneos.append(listaTotalEquipos.get(i).ELOtotalEquipo());
            } else {
                torneos.append("--- ");
                torneos.append("VERSUS");
                torneos.append("--- ");
                torneos.append(listaTotalEquipos.get(i));
                torneos.append("||");
                torneos.append("ELO = ");
                torneos.append(listaTotalEquipos.get(i).ELOtotalEquipo());
                torneos.append("\n");
            }




        }
        return torneos;
    }

    protected void generarEquipo() throws Excepcion {


        Equipo equipo[] = new Equipo[20];
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = new Equipo();
            Jugador jugadores[] = new Jugador[5];
            for (int j = 0; j < jugadores.length - 1; j++) {
                jugadores[j] = new Carry();
                jugadores[j + 1] = new Coach();

            }
            equipo[i].setListaJugadoresEquipo(Arrays.asList(jugadores));
            listaTotalEquipos.add(equipo[i]);

        }
    }
    protected void cincoMejoresJugadores() {
        List<Jugador>listaAux=new ArrayList<>();
        listaTotalEquipos.forEach(equipo -> listaAux.addAll(equipo.getListaJugadoresEquipo()));
        listaAux.sort((x, y) -> Double.compare(y.ELO(), x.ELO()));
        listaAux.stream().limit(5).forEach(jugador -> System.out.println(jugador));


    }

    protected void mejoresCincoEquipos() {
        listaTotalEquipos.sort((x, y) -> Double.compare(y.ELOtotalEquipo(), x.ELOtotalEquipo()));
        listaTotalEquipos.stream().limit(5).forEach(System.out::println);

    }




    }

