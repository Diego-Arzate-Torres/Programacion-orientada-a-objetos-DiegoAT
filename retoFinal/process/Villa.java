package edu.diego.arzate.torres.retoFinal.process;


/**
 La clase Villa representa un objeto que especifica los requerimientos para construir una casa y
 lleva a cabo la verificación de si el jugador tiene suficientes materiales para construir la casa,
 además de restar los materiales de la cantidad del jugador si se cumplen los requerimientos.
 */
public class Villa {
    /**
     Cantidad de madera requerida para construir la casa.
     */
    private int maderaRequerida =5;
    /**
     Cantidad de piedra requerida para construir la casa.
     */
    private int piedraRequerida =5;
    /**
     Cantidad de metal requerida para construir la casa.
     */
    private int metalRequerido =5;
    /**
     Establece los requerimientos de materiales para construir la casa.
     @param maderaRequerida cantidad de madera requerida
     @param piedraRequerida cantidad de piedra requerida
     @param metalRequerido cantidad de metal requerida
     */
    public void requerimientosCasa(int maderaRequerida, int piedraRequerida, int metalRequerido) {
        this.maderaRequerida = maderaRequerida;
        this.piedraRequerida = piedraRequerida;
        this.metalRequerido = metalRequerido;
    }
    /**
     Verifica si el jugador tiene suficientes materiales para construir la casa.
     @param jugador objeto Jugador que se verifica
     @return true si el jugador tiene suficientes materiales, false si no los tiene
     */
    public boolean tieneSuficientesMateriales(Jugador jugador) {
        return jugador.getMadera() >= maderaRequerida &&
                jugador.getPiedra() >= piedraRequerida &&
                jugador.getMetal() >= metalRequerido;
    }
    /**
     Resta los materiales requeridos de la cantidad del jugador si se cumplen los requerimientos.
     @param jugador objeto Jugador al que se le restan los materiales
     */
    public void restarMateriales(Jugador jugador) {
        jugador.restarMadera(maderaRequerida);
        jugador.restarPiedra(piedraRequerida);
        jugador.restarMetal(metalRequerido);
    }
    /**
     Imprime en consola los requerimientos de la casa.
     */
    public void mostrarRequerimientos() {
        System.out.println("Requerimientos de la casa:");
        System.out.println("Madera requerida: " + maderaRequerida);
        System.out.println("Piedra requerida: " + piedraRequerida);
        System.out.println("Metal requerido: " + metalRequerido);
    }
}
