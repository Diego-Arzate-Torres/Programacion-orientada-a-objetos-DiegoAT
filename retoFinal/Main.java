package edu.diego.arzate.torres.retoFinal;

import edu.diego.arzate.torres.retoFinal.process.Jugador;
import edu.diego.arzate.torres.retoFinal.ui.Juego;
/**
 La clase Main es la clase principal que se encarga de iniciar el juego.
 */
public class Main {
    /**
     El método main crea una instancia de la clase Jugador y de la clase Juego y llama al método jugar de la clase Juego.
     @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Juego juego = new Juego(jugador);
        Juego.jugar();
    }
}