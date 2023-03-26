package edu.diego.arzate.torres.reto9.ayudantes.process;
import java.util.Random;

public class Ayudante {
    /**
     * Esta clase se encarga de hacer aleatorias las caracteristicas y de hacerlas objetos para que puedan ser usadas en el CLI
     */
    private static int numeroDeOjos;
    public static String colorDePiel;
    public static String altura;
    public static int nivelCreacion;
    public static int nivelArreglo;
    public static int nivelDestructivo;

        public Ayudante() {
            Random rand = new Random();
            this.numeroDeOjos = rand.nextInt(2) + 1;
            this.colorDePiel = rand.nextBoolean() ? "amarilla" : "morada";
            this.altura = rand.nextBoolean() ? "mediano" : "alto";
            this.nivelCreacion = rand.nextInt(5) + 1;
            this.nivelArreglo = rand.nextInt(5) + 1;
            this.nivelDestructivo = rand.nextInt(5) + 1;

            /**
             * Este ayuda a hacer las caracteristicas de los ayudantes aleatorias para que estos no se repitan
             */
        }

    public static int ObtenNumOjos() {
        return numeroDeOjos;
    }

    public static String ObtenColorPiel() {
        return colorDePiel;
    }

    public static String ObtenAltura() {
        return altura;
    }

    public static int ObtenNivelCreacion() {
        return nivelCreacion;
    }

    public static int ObtenNivelArreglo() {
        return nivelArreglo;
    }

    public static int ObtenNivelDestrucccion() {
        return nivelDestructivo;
    }
    /**
     * Estos se encargan de devolver los valores aleatoreos de los ayudantes al CLI para que estos sean desplegados y mostrados
     */
}