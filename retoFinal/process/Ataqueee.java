package edu.diego.arzate.torres.retoFinal.process;

public class Ataqueee {
    private String nombre;
    private int poder;

    public Ataqueee(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int calcularDanio() {
        return (int) (Math.random() * poder) + 1;
    }
}
