package edu.diego.arzate.torres.reto9.diagramaclases.process;

/**
 *este proceso se encarga de asignar y modificar los valores de la pelota, asi como devolver los valores de esta
 */
public class Diagrama {

    public static class pelota {
        public static String color;
        public static int rapidez;
        public static int poder;

        public pelota(String color, int rapidez, int poder) {
            this.color = color;
            this.rapidez = rapidez;
            this.poder = poder;
        }

        public void disminuirRapidez() {
            this.rapidez--;
        }

        public void aumentarPoder() {
            this.poder++;
        }

        /**
         * Estos se encargan de aumentar y disminuir el poder y la rapidez
         */

        public String toString() {
            return "Pelota {" +
                    "color=" + Diagrama.pelota.color +
                    ", rapidez=" + Diagrama.pelota.rapidez +
                    ", poder=" + Diagrama.pelota.poder +
                    '}';
        }
        /**
         * Este se encarga de desplegar los datos de la pelota, tanto el color, poder y rapidez de esta
         */
        }

    }

