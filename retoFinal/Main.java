package edu.diego.arzate.torres.retoFinal;

import edu.diego.arzate.torres.retoFinal.process.Jugador;
import edu.diego.arzate.torres.retoFinal.ui.Juego;

public class Main {

    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Juego juego = new Juego(jugador);
        Juego.jugar();
    }
}