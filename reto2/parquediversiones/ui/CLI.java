/**
 *Este se encarga de hacer la interfaz la cual le dira que hacer al usuario, asi como de darle la posibilidad de elegir entre las opciones desplegadas, y en caso de que se de una opcion invalida, se repite el menu
 *
 *Los contadores se encargan de medir cuantas veces se ingresa esa opcion, asi como ayudar a cerrar el cliclo y dal la cuenta final
 * los case ayudan a dar las respuestas dependiendo de la opcion ingresada
 * el salida: ayuda a cerrar el programa en caso de que asi lo dese el usuario
 *
 *
 */

package edu.diego.arzate.torres.reto2.parquediversiones.ui;

import java.util.Scanner;

import static edu.diego.arzate.torres.reto2.parquediversiones.process.Boletos.*;

public class CLI {
     public static void opciones() {
         int ContadorN = 0;
         int ContadorA = 0;
         int ContadorI = 0;
         int ContadorAM = 0;
         int Cuenta = 0;

         salida:
         do {
             System.out.println("-|Bienvenido usuario|-" + "\n" + "\n" + "Que boleto tiene?");
             System.out.println("Opciones:" + "\n" + "\n" + "A|Adulto $100" + "\n" + "N|Niño $70" + "\n" + "I|INAPAM $50" + "\n" + "AM|Adulto mayor $70" + "\n" + "S|Salir" + "\n"+"C|Cuenta");

             String Boletos = "";
             Scanner scanner = new Scanner(System.in);
             Boletos = scanner.nextLine();
             if (Boletos.equals("S")){
                 System.out.println("Entendible, se a cancelado su cuenta, tenga un buen dia");
                 break salida;
             }
             switch (Boletos){
                 case "A":
                     ContadorA++;
                     System.out.println("El costo del Boleto es de " + "$"+BAdulto);
                     break;
                 case  "N":
                     ContadorN++;
                     System.out.println("El costo del Boleto es de " + "$"+BNiño);
                     break;
                 case "I":
                     ContadorI++;
                     System.out.println("El costo del Boleto es de " + "$"+BINAPAM);
                     break;
                 case "AM":
                     ContadorAM++;
                     System.out.println("El costo del Boleto es de " + "$"+BNiño);
                     break;

                 case"C":
                     Cuenta++;

             }
         }while(Cuenta == 0);
         
             System.out.println("El costo final de su cuenta es de:" + "$" + CalCosto(ContadorN, ContadorA, ContadorI, ContadorAM));



     }
}
