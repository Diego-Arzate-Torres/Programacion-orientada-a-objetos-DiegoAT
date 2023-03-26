package edu.diego.arzate.torres.reto9.ayudantes.ui;

import edu.diego.arzate.torres.reto9.ayudantes.process.Ayudante;

/**
 *  Este ayuda a crear todos los ayudantes y poner los elementos de cada ayudante en orden, asi como separar estos y enumerarlos
 */
public class CLI {

    public static void desplegarayudantes() {
        Ayudante[] ayudantes = new Ayudante[5];
        for (int i = 0; i < 5; i++) {
            ayudantes[i] = new Ayudante();
            System.out.println("Ayudante #" + (i+1));
            System.out.println("Número de ojos: " + ayudantes[i].ObtenNumOjos());
            System.out.println("Color de piel: " + ayudantes[i].ObtenColorPiel());
            System.out.println("Altura: " + ayudantes[i].ObtenAltura());
            System.out.println("Nivel de creación: " + ayudantes[i].ObtenNivelCreacion());
            System.out.println("Nivel de arreglo: " + ayudantes[i].ObtenNivelArreglo());
            System.out.println("Nivel destructivo: " + ayudantes[i].ObtenNivelDestrucccion());
            System.out.println("-------------------------------------------");
        }
        /**
         * Cada uno de estos se encarga de mostrar tanto el numero del ayudante como las caracteristicas de este, ya aleatorizadas por el process
         */
    }
}
