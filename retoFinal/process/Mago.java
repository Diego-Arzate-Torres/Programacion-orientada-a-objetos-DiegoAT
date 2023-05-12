package edu.diego.arzate.torres.retoFinal.process;

import java.util.ArrayList;

public class Mago {

    private int poder;
    private ArrayList<Hada> hadasCautivas;

    public Mago() {
        this.poder = 0;
        this.hadasCautivas = new ArrayList<Hada>();
    }

    public int getPoder() {
        return poder;
    }

    public void capturarHada(Hada hada) {
        this.hadasCautivas.add(hada);
        if (hadasCautivas.size() % 10 == 0) {
            this.poder++;
        }
    }

    public void liberarHada(Hada hada) {
        this.hadasCautivas.remove(hada);
        if (hadasCautivas.size() % 10 == 9) {
            this.poder--;
        }
    }
    }


