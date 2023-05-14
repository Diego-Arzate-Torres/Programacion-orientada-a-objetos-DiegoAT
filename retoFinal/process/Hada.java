package edu.diego.arzate.torres.retoFinal.process;
/**
 La clase Hada representa un personaje del juego que puede ser rescatado y pertenecer a una casa en particular.
 */
public class Hada {
    private boolean rescatada;
    private String casa;
    /**
     Constructor de la clase Hada que inicializa la variable "rescatada" como false y la variable "casa" como vacía.
     */
    public Hada() {
        rescatada = false;
        casa = "";
    }
    /**
     Establece el valor de la variable "rescatada".
     @param rescatada Valor booleano que indica si el hada ha sido rescatada por el jugador.
     */
    public void setRescatada(boolean rescatada) {
        this.rescatada = rescatada;
    }
    /**

     Obtiene el valor de la variable "rescatada".
     @return Valor booleano que indica si el hada ha sido rescatada por el jugador.
     */
    public boolean isRescatada() {
        return rescatada;
    }
    /**
     Establece el valor de la variable "casa".
     @param casa Cadena de caracteres que indica la casa a la que pertenece el hada.
     */
    public void setCasa(String casa) {
        this.casa = casa;
    }
    /**

     Obtiene el valor de la variable "casa".
     @return Cadena de caracteres que indica la casa a la que pertenece el hada.
     */
    public String getCasa() {
        return casa;
    }
}
