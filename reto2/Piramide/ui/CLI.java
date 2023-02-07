/**
 * Este se encarga de hacer que el usuario ingrese un numero de asteriscos y que el sistema lo guarde en la variable numastericos
 *
 *
 *
 *
 */
package edu.diego.arzate.torres.reto2.Piramide.ui;

import edu.diego.arzate.torres.reto2.Piramide.Process.Piramide;

import java.util.Scanner;


public class CLI {
    public static int numasteriscos;
        public static void menu() {

            System.out.println("Bienvenido usuario" + "\n" + "Ingrese el num de asteriscos:");
            Scanner scanner = new Scanner(System.in);
            numasteriscos = scanner.nextInt();
            Piramide.piramideancho(numasteriscos);
        }
    }
