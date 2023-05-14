package edu.diego.arzate.torres.retoFinal.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mago {

    private int poder;
    private List<Ataqueee> ataques;

    public Mago() {
        poder = 50;
        ataques = new ArrayList<>();
        ataques.add(new Ataqueee("Bola de fuego", 10));
        ataques.add(new Ataqueee("Rayo", 15));
        ataques.add(new Ataqueee("Maldición", 20));
    }

    public int getPoder() {

        return this.poder;
    }

    public boolean restarPoder(int cantidad) {
        if (cantidad > poder) {
            poder = 0;
            return true;
        } else {
            poder -= cantidad;
            return false;
        }
    }

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

    public int atacar(Jugador jugador) {
        Ataqueee ataque = seleccionarAtaque();
        int danio = ataque.calcularDanio();
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




