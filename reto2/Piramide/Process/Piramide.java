package edu.diego.arzate.torres.reto2.Piramide.Process;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        piramide();
    }
    Scanner scanner = new Scanner(System.in);
    int Numero = scanner.nextInt();


    public static void piramide() {
        for (int i = 0; i < i ; i++) {
            for (int j = 0; j < i; j++) {
                if (i == 5) {
                    System.out.print("*");
                }
            }
        }
    }
}
