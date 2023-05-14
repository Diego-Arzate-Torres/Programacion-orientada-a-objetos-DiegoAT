package edu.diego.arzate.torres.retoFinal.ui;

import edu.diego.arzate.torres.retoFinal.process.Jugador;
import edu.diego.arzate.torres.retoFinal.process.Mago;
import edu.diego.arzate.torres.retoFinal.process.Ogro;

import java.util.Scanner;

/**
 La clase Juego representa el juego principal del programa.
 Contiene un jugador, un mago y un ogro, y ofrece diferentes opciones
 De juego para el jugador.
 */
public class Juego {
    /**
     El jugador del juego.
     */
    private static Jugador jugador;
    /**
     El mago del juego.
     */
    private static Mago mago;
    /**
     El ogro del juego.
     */
    private static Ogro ogro;
    /**

     Constructor de la clase Juego.
     @param jugador El jugador del juego.
     */
    public Juego(Jugador jugador) {
        Juego.jugador = new Jugador();
        mago = new Mago();
        ogro = new Ogro();
    }

    /**
     Método que inicia el juego y muestra las opciones disponibles al usuario.
     */
    public static void jugar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego");
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Construir casa");
            System.out.println("2. Rescatar hada");
            System.out.println("3. Recolectar material");
            System.out.println("4. Atacar al ogro");
            System.out.println("5. Ver estadísticas");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    jugador.construirCasa();
                    break;
                case 2:
                    jugador.rescatarHada();
                    break;
                case 3:
                    jugador.recolectarMaterial();
                    break;
                case 4:
                    if (ogro.estaDerrotado()) {
                        System.out.println("¡Ya has derrotado al ogro! No hay necesidad de atacarlo de nuevo.");
                    } else {
                        boolean ogroDerrotado = jugador.restarPoder(ogro.getPoder() - 10);
                        if (ogroDerrotado) {
                            System.out.println("¡Felicitaciones, has derrotado al ogro!");
                        } else if (jugador.getNivel() == 0) {
                            System.out.println("¡Lo siento, has perdido! El poder del ogro ha aumentado demasiado.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("----Estadísticas----");
                    System.out.println("Nivel del jugador: " + jugador.getNivel());
                    System.out.println("Hadas rescatadas: " + jugador.getHadasRescatadas());
                    System.out.println("Casas construidas: " + jugador.getCasasConstruidas());
                    System.out.println("Poder del mago: " + mago.getPoder());
                    System.out.println("Poder del ogro: " + ogro.getPoder());
                    break;
                case 6:
                    System.out.println("Gracias por jugar");
                    juegoTerminado = true;
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo");
            }
/**
 Este método es parte del juego y se ejecuta cada vez que el jugador decide atacar al ogro.
 Primero verifica si el juego ha terminado, y luego hace que el ogro ataque al jugador. Si el jugador es golpeado,
 se muestra un mensaje en la consola. Luego, el método llama al método "restarPoderMago" del jugador para atacar al mago.
 Si el mago es derrotado, se muestra un mensaje en la consola y se establece la variable "juegoTerminado" en true.
 Si el nivel del jugador es 0, se muestra un mensaje en la consola y se establece la variable "juegoTerminado" en true.
 */
            if (!juegoTerminado) {
                boolean jugadorGolpeado = ogro.atacarJugador(jugador);
                if (jugadorGolpeado) {
                    System.out.println("¡El ogro te ha golpeado, cuidado!");
                }
                boolean magoDerrotado = jugador.restarPoderMago(mago);
                if (magoDerrotado) {
                    System.out.println("¡Felicitaciones, has derrotado al mago!");
                    juegoTerminado = true;
                } else if (jugador.getNivel() == 0) {
                    System.out.println("¡Lo siento, has perdido! El poder del mago ha aumentado demasiado");
                    juegoTerminado = true;
                }
            }
        }
    }
}
