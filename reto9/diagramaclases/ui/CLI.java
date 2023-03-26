package edu.diego.arzate.torres.reto9.diagramaclases.ui;
import edu.diego.arzate.torres.reto9.diagramaclases.process.Diagrama;
import java.util.Scanner;

public class CLI {
        public static void pelota() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el color de la pelota: ");
            String color = scanner.nextLine();
            /**
             * Este se encarga de preguntarle al usuario del color de la pelota
             */
            System.out.print("Ingrese la rapidez de la pelota: ");
            int rapidez = scanner.nextInt();
            /**
             * Este se encarga de preguntarle al usuario la rapidez a la que va su pelota
             */
            System.out.print("Ingrese el poder de la pelota: ");
            int poder = scanner.nextInt();
            /**
             * Este se encarga de preguntarle al usuario el poder que tiene su pelota
             */

            Diagrama.pelota pelota = new Diagrama.pelota(color, rapidez, poder);

            System.out.println("Pelota creada: " + pelota.toString());
            pelota.disminuirRapidez();
            pelota.aumentarPoder();
            System.out.println("Pelota modificada: " + pelota.toString());
            /**
             * Este tiene como propocito modificar los valores de la pelota, ya sea disminuyendo o aumntando valores de esta
             */

        }

}
