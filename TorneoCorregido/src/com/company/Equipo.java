package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private List<Jugador> listaJugadoresEquipo = new ArrayList<>(5);


    public void setListaJugadoresEquipo(List<Jugador> listaJugadoresEquipo) throws Excepcion {
        this.listaJugadoresEquipo = listaJugadoresEquipo;

    }

    protected List<Jugador> getListaJugadoresEquipo() {
        return listaJugadoresEquipo;
    }

    private void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }


    public Equipo() throws Excepcion {
        this.setNombreEquipo(GenerarInfoRandom.nombreEquipo());
        this.listaJugadoresEquipo = listaJugadoresEquipo;
        validarLengthJugadores(listaJugadoresEquipo);
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                "ELOTOTAL="+ ELOtotalEquipo()+
                '}';
    }

    protected double ELOtotalEquipo() {
        double ElOtot=listaJugadoresEquipo.stream().mapToDouble(Jugador::ELO).sum();
        return ElOtot;
    }


    private void validarLengthJugadores(List<Jugador> listaJugadoresEquipo) throws Excepcion {
        if (listaJugadoresEquipo.size() > 5) {
            throw new Excepcion("El número de jugadores debe ser 5");
        } else {
            this.listaJugadoresEquipo = listaJugadoresEquipo;

        }
    }


}
