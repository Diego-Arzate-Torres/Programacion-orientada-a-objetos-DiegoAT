package edu.diego.arzate.torres.reto2.parquediversiones.ui;

import edu.diego.arzate.torres.reto2.parquediversiones.process.Boletos;

import java.util.Scanner;

public class CLI {
     public static void opciones(){
         System.out.println("-|Bienvenido usuario|-" + "\n" + "\n" + "Que boleto tiene?");
         System.out.println("Opciones:" + "\n" + "\n" + "A|Adutlo" + "\n" + "N|Niño" + "\n" + "I|INAPAM" + "\n" + "AM|Adulto mayor");

         Scanner scanner = new Scanner(System.in);
         int opciones = scanner.nextInt();
         scanner.nextLine();
         switch (opciones) {
             case 1 -> {
              return BoletoAdulto;
             }
             case 2  -> {
               return Bniño;
             }
             case 3 -> {
                 return  BINAPAM;
             }
             case 4 -> {
                 return Bniño;
             }

         }
     }
}
