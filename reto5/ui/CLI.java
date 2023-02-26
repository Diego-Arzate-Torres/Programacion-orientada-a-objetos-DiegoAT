package edu.diego.arzate.torres.reto5.ui;

import edu.diego.arzate.torres.reto5.process.palabras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * ahorcado
 * @author Diego
 */
public class CLI {
    /**
     * Este se encarga de mostrar todo lo visual del ahorcado
     *
     */
    public static void Menu() {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> letrasAgregadas = new ArrayList<>();
        ArrayList<Integer> Descubiertas = new ArrayList<>();


        String Decifrar = "";
        String letra;
        int dificultad = 4;
        int intentos = 0;

        while (dificultad != 0) {
            letrasAgregadas.clear();
            Descubiertas.clear();


            System.out.println("Seleccione una dificultad");
            System.out.println("1| Facil");
            System.out.println("2| Media");
            System.out.println("3| Dificil");
            System.out.println("0| Salir");
            dificultad = scanner.nextInt();


            switch (dificultad) {
                case 1:
                    Decifrar = palabras.Facil();
                    break;
                case 2:
                    Decifrar = palabras.Intermedia();
                    break;
                case 3:
                    Decifrar = palabras.Dificil();
                    break;
            }
/**
 *
 *Este switch ayuda al usuario a elegir la dificultad que desea
 */

            while (Descubiertas.size() != Decifrar.length()) {
                System.out.println("Introduce una letra");
                letra = scanner.next().toUpperCase();


                if (letrasAgregadas.contains(letra)) {
                    System.out.println("Introduce otra por favor");
                    intentos++;
                    continue;
                }


                boolean Encontrado = false;
                for (int i = 0; i < Decifrar.length(); i++) {
                    if (Decifrar.charAt(i) == letra.charAt(0)) {
                        Encontrado = true;
                        Descubiertas.add(i);
                    }
                }


                letrasAgregadas.add(letra);
                if (Encontrado) {


                    for (int i = 0; i < Decifrar.length(); i++) {
                        if (Descubiertas.contains(i)) {
                            System.out.print(Decifrar.charAt(i));
                        } else {
                            System.out.print("X");
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println("Intentalo de nuevo");

                }
                if (intentos == 8) {
                    System.out.println("Perdiste, la palabra era" + Encontrado);
                    break;
                }
                else{
                    System.out.println("felicidades ganaste!");
                }

/**
 * Este While ayuda a crear como tal el ahorcado, ya que este permite decirle al usuario que letras tiene y cuales les falta
 * asi como decirle si está equivocado.
 * También se le anade una cantidad de intentos, si el jugador excede el juego se reinicia
 */

            } System.out.println("Si desea salir, introduzca 0, de lo contrario, eliga alguna dificultad");
        }

    }
}
