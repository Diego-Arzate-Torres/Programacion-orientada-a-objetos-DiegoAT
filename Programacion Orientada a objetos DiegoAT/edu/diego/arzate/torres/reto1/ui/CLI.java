package edu.diego.arzate.torres.reto1.ui;

import edu.diego.arzate.torres.reto1.process.Calculadora;

import java.util.Scanner;


    public class CLI {
        public static void Menu() {
            System.out.println("Bienvenido usuario");
            System.out.println("Elige una opción:");
            System.out.println("1| suma");
            System.out.println("2| resta");
            System.out.println("3| multiplcacion");
            System.out.println("4| dividir");

            Scanner scanner = new Scanner(System.in);

            int option = scanner.nextInt();
            scanner.nextLine();

            System.out.println("introduce el primer valor");
            int numuno = scanner.nextInt();
            scanner.nextLine();
            System.out.println("introduce el segundo valor");
            int numdos = scanner.nextInt();
            scanner.nextLine();
            int resultado = -1;
            String operacion = "";

            switch (option) {
                case 1 -> {
                    resultado = Calculadora.sumar(numuno, numdos);
                    operacion = "+";
                }
                case 2 -> {
                    resultado = Calculadora.restar(numuno, numdos);
                    operacion = "-";
                }
                case 3 -> {
                    resultado = Calculadora.multiplicar(numuno, numdos);
                    operacion = "*";
                }
                case 4 -> {
                    resultado = Calculadora.dividir(numuno, numdos);
                    operacion = "/";
                }
                default -> System.out.println("Numero no valido");
            }
            System.out.printf("El resultado de la operación de %d %s %d = %d", numuno, operacion, numdos, resultado);


        }
    }

