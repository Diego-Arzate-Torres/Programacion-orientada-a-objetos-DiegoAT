package edu.diego.arzate.torres.retoFinal.process;
/**
 La clase Ogro representa a un enemigo del juego que tiene una cierta cantidad de vida y poder de ataque.
 Hereda de la clase Mago.
 */
public class Ogro extends Mago {


    /** La cantidad de vida que tiene el ogro */
    private int vida;
    /** La cantidad de poder de ataque que tiene el ogro */
    private int poder;
    /**
     Crea un objeto Ogro con una vida de 100 y un poder de ataque de 30.
     */
    public Ogro() {
        vida = 100;
        poder = 30;
    }
    /**
     Crea un objeto Ogro con una vida de 100 y un poder de ataque de 30.
     */
    public boolean estaDerrotado() {
        return poder <= 0;
    }
    /**
    Reduce la vida del ogro al recibir un ataque de un poder determinado.
    @param poderAtaque El poder del ataque recibido.
            @return true si el ogro ha sido derrotado, false de lo contrario.
    */
    public boolean recibirAtaque(int poderAtaque) {
        vida -= poderAtaque;
        if (vida <= 0) {
            System.out.println("El ogro ha sido derrotado");
            return true;
        } else {
            return false;
        }
    }
    /**
     Ataca al jugador con su poder de ataque.
     @param jugador El jugador que recibe el ataque.
     @return true si el jugador ha sido derrotado, false de lo contrario.
     */
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
    /**

     Devuelve la cantidad de vida que tiene el ogro.
     @return La cantidad de vida del ogro.
     */
    public int getVida() {
        return vida;
    }
    /**
     Devuelve la cantidad de poder de ataque que tiene el ogro.
     @return La cantidad de poder de ataque del ogro.
     */
    public int getPoder() {
        return poder;
    }
}