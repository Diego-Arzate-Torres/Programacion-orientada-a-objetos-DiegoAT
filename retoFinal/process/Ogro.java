package edu.diego.arzate.torres.retoFinal.process;

import java.util.Random;

public class Ogro {
    public void pelearConOrco(int fuerzaJugador, int vidaJugador, int fuerzaOrco, int vidaOrco) {
        Random random = new Random();
        boolean turnoJugador = random.nextBoolean(); // determina el turno inicial de la pelea

        while (vidaJugador > 0 && vidaOrco > 0) {
            if (turnoJugador) {
                // turno del jugador
                int golpeJugador = random.nextInt(fuerzaJugador);
                int defensaOrco = random.nextInt(fuerzaOrco / 2);
                int danio = Math.max(0, golpeJugador - defensaOrco);
                System.out.println("El jugador golpea al orco con " + golpeJugador + " puntos de fuerza");
                System.out.println("El orco se defiende con " + defensaOrco + " puntos de fuerza");
                System.out.println("El jugador causa " + danio + " puntos de daño");
                vidaOrco -= danio;
                System.out.println("La vida del orco es " + vidaOrco);
                turnoJugador = false;
            } else {
                // turno del orco
                int golpeOrco = random.nextInt(fuerzaOrco);
                int defensaJugador = random.nextInt(fuerzaJugador / 2);
                int danio = Math.max(0, golpeOrco - defensaJugador);
                System.out.println("El orco golpea al jugador con " + golpeOrco + " puntos de fuerza");
                System.out.println("El jugador se defiende con " + defensaJugador + " puntos de fuerza");
                System.out.println("El orco causa " + danio + " puntos de daño");
                vidaJugador -= danio;
                System.out.println("La vida del jugador es " + vidaJugador);
                turnoJugador = true;
            }
        }

        if (vidaJugador <= 0) {
            System.out.println("El jugador ha perdido");
        } else {
            System.out.println("El jugador ha ganado");
        }
    }
}