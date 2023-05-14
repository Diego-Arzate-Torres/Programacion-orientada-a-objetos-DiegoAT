package edu.diego.arzate.torres.retoFinal.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 La clase Mago representa al enemigo del jugador en el juego.
 */
public class Mago {

    private int poder;
    private List<Ataqueee> ataques;
    /**
     Crea un nuevo objeto de tipo Mago con una cantidad de poder y una lista de ataques predefinidos.
     */
    public Mago() {
        poder = 50;
        ataques = new ArrayList<>();
        ataques.add(new Ataqueee("Bola de fuego", 10));
        ataques.add(new Ataqueee("Rayo", 15));
        ataques.add(new Ataqueee("Maldición", 20));
    }
    /**
     Devuelve la cantidad actual de poder del mago.
     @return la cantidad actual de poder del mago
     */
    public int getPoder() {

        return this.poder;
    }
    /**
     Resta la cantidad especificada de poder al mago y devuelve si el mago ha sido derrotado o no.
     @param cantidad la cantidad de poder a restar
     @return true si el mago ha sido derrotado, false en caso contrario
     */
    public boolean restarPoder(int cantidad) {
        if (cantidad > poder) {
            poder = 0;
            return true;
        } else {
            poder -= cantidad;
            return false;
        }
    }
    /**
     Permite al mago seleccionar uno de sus ataques.
     @return el ataque seleccionado por el mago
     */
    public Ataqueee  seleccionarAtaque() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un ataque:");
        for (int i = 0; i < ataques.size(); i++) {
            System.out.println((i + 1) + ". " + ataques.get(i).getNombre() + " (poder: " + ataques.get(i).getPoder() + ")");
        }
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return ataques.get(opcion - 1);
    }
    /**
     Permite al mago atacar al jugador con un ataque seleccionado previamente.
     @param jugador el jugador que va a ser atacado
     @return la cantidad de daño que el ataque ha causado al jugador, o -1 si el jugador ha sido derrotado
     */
    public int atacar(Jugador jugador) {
        Ataqueee ataque = seleccionarAtaque();
        int danio = ataque.calcularDaño();
        boolean jugadorDerrotado = jugador.recibirAtaque(danio);
        if (jugadorDerrotado) {
            System.out.println("¡El mago ha ganado!");
            return -1;
        } else {
            System.out.println("El mago ha usado " + ataque.getNombre() + " y ha causado " + danio + " de daño.");
            return danio;
        }
    }
}




