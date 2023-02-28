package edu.diego.arzate.torres.reto5.process;
import java.util.Random;

public class palabras {
    /**
     *
     * Este nos ayuda a poner las distintas dificultades del ahorcado
     */
    public static String Facil(){
        String[] facil = {"Pato", "Gato", "Mesa", "Lago", "Taza"};
        Random random = new Random();


        return facil[random.nextInt(facil.length)];
    }


    public static String Intermedia(){
        String[] Intermedia = {"Aventura", "Celebrar", "Escritor", "Guitarra", "Hospital"};
        Random random = new Random();

        return Intermedia[random.nextInt(Intermedia.length)];
    }



    public static String Dificil(){
        String[] dificil = {"Matemáticas", "Inconsciente", "Universitario", "Monstruosos", "Infinitamente"};
        Random random = new Random();


        return dificil[random.nextInt(dificil.length)];
    }
}





