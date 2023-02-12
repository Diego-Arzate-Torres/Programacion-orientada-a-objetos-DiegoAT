/**
 * @author Diego Arzate Torres
 * Este CLI se encarga de mostrar el menu para las conversiones
 * @param numero (todos los nums) sirve para llamar a las variables del conversor y poder usarlas para cada opcion dentro del switch
 * @param sistema este hace una suma para hacer saber al while que opciones son las válidas y que encaso de ingresar una que no es marca un error
 */


package edu.diego.arzate.torres.reto3.ui;

import edu.diego.arzate.torres.reto3.process.conversor;

import java.util.Scanner;


public class CLI {

public static String numero;
public static int numero2;
public static int numero3;
public static String numeroB;
public static String numeroO;
public static String numeroH;


    public static void menu() {


        int Conversiones;
        Scanner escaner = new Scanner(System.in);
        salida:
        do {
            System.out.println("****************************" + "\n" + "   Bienvenido    usuario      " + "\n" + "****************************" + "\n");
            System.out.println("A que unidad desea convertir?" + "\n");
            System.out.println("1|De decimal a binario" + "\n" + "2|De decimal a octanal" + "\n" + "3| De decimal a hexadecimal" + "\n" + "4|De binario a decimal" + "\n" + "5|De octal a decimal" + "\n" + "6|De hexadecimal a decimal" + "\n" + "7|Salir");


            Conversiones = escaner.nextInt();
            if (Conversiones == 7) {
                System.out.println("Entendible, tenga un buen dia");
                break salida;

            }
            switch (Conversiones) {
                case 1:
                    System.out.println("Ingresa el numero:");
                    Scanner scanner = new Scanner(System.in);
                    numero = scanner.nextLine();
                    System.out.println("La conversion es de:" + conversor.conversorDaB(Long.parseLong(numero)));
                    break;
                case 2:
                    System.out.println("Ingresa el numero:");
                    Scanner scanner1 = new Scanner(System.in);
                    numero2 = Integer.parseInt(scanner1.nextLine());
                    System.out.println("La conversion es de:" + conversor.conversorDaO(numero2));
                    break;
                case 3:
                    System.out.println("Ingresa el numero:");
                    Scanner scanner2 = new Scanner(System.in);
                    numero3 = Integer.parseInt(scanner2.nextLine());
                    System.out.println("La conversion es de:" + conversor.conversorDaH(numero3));
                    break;
                case 4:
                    System.out.println("Ingresa el numero:");
                    Scanner scanner3 = new Scanner(System.in);
                    numeroB = scanner3.nextLine();
                    System.out.println("La conversion es de:" + conversor.conversorBaD(numeroB));
                    break;
                case 5:
                    System.out.println("Ingresa el numero:");
                    Scanner scanner5 = new Scanner(System.in);
                    numeroO = scanner5.nextLine();
                    System.out.println("La conversion es de:" + conversor.ConversorOaD(numeroO));
                    break;
                case 6:
                    System.out.println("Ingresa el numero:");
                    Scanner scanner6 = new Scanner(System.in);
                    numeroH = scanner6.nextLine();
                    System.out.println("La conversion es de:" + conversor.conversorHaD(numeroH));
                    break;
            }
        } while (Conversiones < 1 || Conversiones > 7);
        {
            System.out.println("ingresa una opcion valida:");
            System.out.println("1|De decimal a binario" + "\n" + "2|De decimal a octanal" + "\n" + "3| De decimal a hexadecimal" + "\n" + "4|De binario a decimal" + "\n" + "5|De octal a decimal" + "\n" + "6|De hexadecimal a decimal" + "\n" + "7|Salir");
            Conversiones = escaner.nextInt();
        }
    }


}
