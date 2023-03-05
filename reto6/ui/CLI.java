package edu.diego.arzate.torres.reto6.ui;

import edu.diego.arzate.torres.reto6.process.Palabras2;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    public static void Menu() {
        Scanner scanner = new Scanner(System.in);

        int dificultad = 5;

        ArrayList<String> letrasagregadas = new ArrayList<>();
        ArrayList<Integer> descubiertas = new ArrayList<>();


        String decifrar = "";
        String letra;
        int intentos = 0;
        try {
            while (dificultad != 0) {
                letrasagregadas.clear();
                descubiertas.clear();

                System.out.println("Seleccione una dificultad");
                System.out.println("1| Facil");
                System.out.println("2| Media");
                System.out.println("3| Dificil");
                System.out.println("0| Salir");
                dificultad = scanner.nextInt();
                switch (dificultad) {
                    case 1:
                        decifrar = Palabras2.facil();
                        System.out.println("Haz seleccionado la dificultad facil: ");
                        break;
                    case 2:
                        decifrar = Palabras2.intermedia();
                        System.out.println("Haz seleccionado la dificultad intermedia: ");

                        break;
                    case 3:
                        decifrar = Palabras2.dificil();
                        System.out.println("Haz seleccionado la dificultad dificil: ");
                        break;
                }
            }
        }catch(NumberFormatException e){
         System.out.println("ingresa una opcion valida por favor");

        }

/**
 *Este switch ayuda al usuario a elegir la dificultad que desea
 */

                while (descubiertas.size() != decifrar.length()) {
                    System.out.println("Introduce una letra");
                    letra = scanner.next().toUpperCase();

                    if (letrasagregadas.contains(letra)) {
                        System.out.println("Introduce otra por favor");
                        intentos++;
                        continue;
                    }
                    try {
                        boolean encontrado = false;
                        for (int i = 0; i < decifrar.length(); i++) {
                            if (decifrar.charAt(i) == letra.charAt(0)) {
                                encontrado = true;
                                descubiertas.add(i);
                            }
                        }


                        letrasagregadas.add(letra);
                        if (encontrado) {


                            for (int i = 0; i < decifrar.length(); i++) {
                                if (descubiertas.contains(i)) {
                                    System.out.print(decifrar.charAt(i));
                                } else {
                                    System.out.print("X");
                                }
                            }
                            System.out.println();
                        } else {
                            System.out.println("Intentalo de nuevo");

                        }
                        if (intentos == 8) {
                            System.out.println("Perdiste, la palabra era Hospital");
                            break;
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Error, cerrando juego. . .");

                    }


/**
 * Este While ayuda a crear como tal el ahorcado, ya que este permite decirle al usuario que letras tiene y cuales les falta
 * asi como decirle si está equivocado.
 * También se le anade una cantidad de intentos, si el jugador excede el juego se reinicia
 */

                }
                System.out.println("Si desea salir, introduzca 0, de lo contrario, eliga alguna dificultad");
            }
        }


