package edu.diego.arzate.torres.retoFinal.process;

import java.util.Random;

public class Jugador {
    private int nivelDeVida;
    private int hadasRescatadas;
    private int madera;
    private int piedra;
    private int metal;

    public Jugador() {
        nivelDeVida = 100; // Establecer nivel de vida inicial del jugador
        hadasRescatadas = 0; // Establecer número de hadas rescatadas inicial del jugador
    }

    public void construirCasa() {
        // Método para construir una casa para una hada
    }

    public void rescatarHada() {
        // Método para rescatar un hada y llevarla a la casa construida
        hadasRescatadas++;
        if (hadasRescatadas % 10 == 0) {
            nivelDeVida += 10; // Aumentar nivel de vida del jugador por cada 10 hadas rescatadas
        }
    }

    public void recibirAtaque() {
        // Método para disminuir el nivel de vida del jugador cuando es atacado por el ogro
        nivelDeVida -= 10;
    }

    public int getNivelDeVida() {
        // Método para obtener el nivel de vida actual del jugador
        return nivelDeVida;
    }

    public int getHadasRescatadas() {
        // Método para obtener el número de hadas rescatadas por el jugador
        return hadasRescatadas;
    }

    // Método para recolectar madera
    public int recolectarMadera(int cantidadM) {
        madera = 0;
        Random random = new Random();
        for (int i = 0; i < cantidadM; i++) {
            int probabilidad = random.nextInt(10) + 1; // Genera un número aleatorio del 1 al 10
            if (probabilidad <= 5) { // Hay un 50% de probabilidad de obtener piedra
                madera++;
            }

        }
        System.out.println("Has recolectado " + madera + " unidades de piedra.");
        return madera;
    }
        // Método para recolectar piedra
        public int recolectarPiedra(int cantidadP){
            piedra = 0;
            Random rnd = new Random();
            for (int i = 0; i < cantidadP; i++) {
                int probabilidad = rnd.nextInt(10) + 1; // Genera un número aleatorio del 1 al 10
                if (probabilidad <= 5) { // Hay un 50% de probabilidad de obtener piedra
                    piedra++;
                }
            }
            System.out.println("Has recolectado " + piedra + " unidades de piedra.");
            return piedra;
        }


        // Método para recolectar metal
        public int recolectarHierro ( int cantidadFe){
            metal = 0;
            Random Rand = new Random();
            for (int i = 0; i < cantidadFe; i++) {
                int probabilidad = Rand.nextInt(10) + 1; // Genera un número aleatorio del 1 al 10
                if (probabilidad <= 5) { // Hay un 50% de probabilidad de obtener piedra
                    metal++;
                }
            }
            System.out.println("Has recolectado " + metal + " unidades de piedra.");
            return metal;
        }
    }

