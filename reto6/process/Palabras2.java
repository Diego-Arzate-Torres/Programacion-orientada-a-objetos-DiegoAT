package edu.diego.arzate.torres.reto6.process;

import java.util.Random;
public class Palabras2 {


    public static String facil() {
        String[] facil = {"Pato", "Gato", "Mesa", "Lago", "Taza"};
        Random random = new Random();


        return facil[random.nextInt(facil.length)];
    }


    public static String intermedia() {
        String[] Intermedia = {"Aventura", "Celebrar", "Escritor", "Guitarra", "Hospital"};
        Random random = new Random();

        return Intermedia[random.nextInt(Intermedia.length)];
    }


    public static String dificil() {
        String[] dificil = {"Matemáticas", "Inconsciente", "Universitario", "Monstruosos", "Infinitamente"};
        Random random = new Random();


        return dificil[random.nextInt(dificil.length)];
    }
/**
 * Cada string se encarga de dar palabras aleatoreas y pasarlas al CLI
 *
 */
}
