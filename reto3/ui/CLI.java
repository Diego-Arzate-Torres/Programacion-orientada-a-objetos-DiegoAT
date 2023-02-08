package edu.diego.arzate.torres.reto3.ui;

import java.util.Scanner;

import static edu.diego.arzate.torres.reto3.process.conversor.Binario;

public class CLI {

public static long numero;
    public static void menu() {


        salida:
        do {
            System.out.println("-Bienvenido usuario-");
            System.out.println("A que unidad desea convertir?");
            System.out.println("DaB|De decimal a binario" + "\n" + "DaO|De decimal a octanal" + "\n" + "DaH| De decimal a hexadecimal" + "\n" + "BaD|De binario a decimal" + "\n" + "OaD|De octal a decimal" + "HaD|De hexadecimal a decimal" + "\n" + "S|Salir");

            String Conversiones = "";
            Scanner scanner = new Scanner(System.in);
            Conversiones = scanner.nextLine();
            if (Conversiones.equals("S")) {
                System.out.println("Entendible, tenga un buen dia");
                break salida;
            }
            switch (Conversiones) {
                case "DaB":
                    System.out.println("Ingresa el numero:");
                    Scanner escaner = new Scanner(System.in);
                    numero = scanner.nextLine();

                    System.out.println("La conversion es de:" + Binario);
                    break;
                case "DaO":
                    System.out.println("La conversion es de:");
                    break;
                case "DaH":
                    System.out.println("La conversion es de:");
                    break;
                case "BaD":
                    System.out.println("La conversion es de:");
                    break;
                case "OaD":
                    System.out.println("La conversion es de:");
                    break;
                case "HaD":
                    System.out.println("La conversion es de:");
                    break;
            }
        } while(true);
    }
}
