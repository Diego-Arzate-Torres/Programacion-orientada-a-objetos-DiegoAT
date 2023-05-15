package edu.diego.arzate.torres.retoFinal.process;
/**
 La clase Ataqueee representa un ataque que puede ser usado por un personaje en un juego.
 Contiene el nombre y el poder del ataque, así como un método para calcular el daño que puede causar.
 */
public class Ataqueee {
    private String nombre;
    private int poder;
    /**
     Crea un nuevo objeto Ataqueee con un nombre y un poder especificados.
     @param nombre el nombre del ataque
     @param poder el poder del ataque
     */
    public Ataqueee(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }
    /**
     Retorna el nombre del ataque.
     @return el nombre del ataque
     */
    public String getNombre() {
        return nombre;
    }
    /**
     Retorna el poder del ataque.
     @return el poder del ataque
     */
    public int getPoder() {
        return poder;
    }
    /**
     Establece el poder del ataque.
     @param poder el nuevo poder del ataque
     */
    public void setPoder(int poder) {
        this.poder = poder;
    }
    /**
     Calcula el daño que puede causar el ataque.
     El daño es un número aleatorio entre 1 y el poder del ataque.
     @return el daño que puede causar el ataque
     */
    public int calcularDaño() {
        return (int) (Math.random() * poder) + 1;
    }
}
