package edu.diego.arzate.torres.retoFinal.process;

public class Hada {
    private boolean rescatada;
    private String casa;

    public Hada() {
        rescatada = false;
        casa = "";
    }

    public void setRescatada(boolean rescatada) {
        this.rescatada = rescatada;
    }

    public boolean isRescatada() {
        return rescatada;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getCasa() {
        return casa;
    }
}
