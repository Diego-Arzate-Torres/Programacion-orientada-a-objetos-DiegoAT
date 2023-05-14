package edu.diego.arzate.torres.retoFinal.process;


public class Villa {
    private int maderaRequerida =10;
    private int piedraRequerida =10;
    private int metalRequerido =10;

    public void RequerimientosCasa(int maderaRequerida, int piedraRequerida, int metalRequerido) {
        this.maderaRequerida = maderaRequerida;
        this.piedraRequerida = piedraRequerida;
        this.metalRequerido = metalRequerido;
    }

    public boolean tieneSuficientesMateriales(Jugador jugador) {
        return jugador.getMadera() >= maderaRequerida &&
                jugador.getPiedra() >= piedraRequerida &&
                jugador.getMetal() >= metalRequerido;
    }

    public void restarMateriales(Jugador jugador) {
        jugador.restarMadera(maderaRequerida);
        jugador.restarPiedra(piedraRequerida);
        jugador.restarMetal(metalRequerido);
    }

    public void mostrarRequerimientos() {
        System.out.println("Requerimientos de la casa:");
        System.out.println("Madera requerida: " + maderaRequerida);
        System.out.println("Piedra requerida: " + piedraRequerida);
        System.out.println("Metal requerido: " + metalRequerido);
    }
}
