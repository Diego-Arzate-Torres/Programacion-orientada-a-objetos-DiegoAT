package edu.diego.arzate.torres.retoFinal.process;

public class Ogro extends Mago {
    private int vida;
    private int poder;

    public Ogro() {
        vida = 100;
        poder = 30;
    }
    public boolean estaDerrotado() {
        return poder <= 0;
    }

    public boolean recibirAtaque(int poderAtaque) {
        vida -= poderAtaque;
        if (vida <= 0) {
            System.out.println("El ogro ha sido derrotado");
            return true;
        } else {
            return false;
        }
    }

    public boolean atacarJugador(Jugador jugador) {
        int poderAtaque = poder;
        jugador.recibirAtaque(poderAtaque);
        if (jugador.getVida() <= 0) {
            System.out.println("El jugador ha sido derrotado");
            return true;
        } else {
            return false;
        }
    }

    public int getVida() {
        return vida;
    }

    public int getPoder() {
        return poder;
    }
}