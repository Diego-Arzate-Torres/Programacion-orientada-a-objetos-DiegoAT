package edu.diego.arzate.torres.retoFinal.process;


import java.util.Scanner;

public class Jugador {
    private int nivel;
    private int hadasRescatadas;
    private int casasConstruidas;
    private int vida;
    private int poder;
    private int madera;
    private int piedra;
    private int metal;

    public Jugador() {
        nivel = 1;
        hadasRescatadas = 0;
        casasConstruidas = 0;
        vida = 100;
        poder = 10;
        this.madera = 0;
        this.piedra = 0;
        this.metal = 0;
    }

    public void construirCasa() {

        if (madera >= 10 && piedra >= 10 && metal >= 10) {
            madera -= 10;
            piedra -= 10;
            metal -= 10;
            System.out.println("¡Has construido una casa y has ganado el juego!");
            System.exit(0);
        } else {
            System.out.println("No tienes suficientes materiales para construir una casa.");
        }
    }
    public void restarMadera(int cantidad) {
        if (this.madera < cantidad) {
            System.out.println("No tienes suficiente madera.");
        } else {
            this.madera -= cantidad;
            System.out.println("Has restado " + cantidad + " unidades de madera.");
        }
    }
    public void restarPiedra(int cantidad) {
        if (this.piedra < cantidad) {
            System.out.println("No tienes suficiente Piedra.");
        } else {
            this.piedra -= cantidad;
            System.out.println("Has restado " + cantidad + " unidades de piedra.");
        }
    }
    public void restarMetal(int cantidad) {
        if (this.metal < cantidad) {
        System.out.println("No tienes suficiente Metal.");
    } else {
        this.metal -= cantidad;
        System.out.println("Has restado " + cantidad + " unidades de Metal.");
        }
    }
    public void rescatarHada() {
        if (hadasRescatadas < 3) {
            hadasRescatadas++;
            System.out.println("¡Has rescatado a un hada! Ya tienes " + hadasRescatadas + " de 3.");
        } else {
            System.out.println("Ya has rescatado a todas las hadas posibles.");
        }
    }


    public void aumentarNivel() {
        nivel++;
        poder += 5;
    }
    public int getMadera() {
        return madera;
    }

    public int getPiedra() {
        return piedra;
    }

    public int getMetal() {
        return metal;
    }
    public void recolectarMaterial() {
        madera = 0;
        piedra = 0;
        metal = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué deseas recolectar?");
        System.out.println("1. Madera");
        System.out.println("2. Piedra");
        System.out.println("3. Metal");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                try {
                    int maderaRecogida = (int) (Math.random() * 5) + 1;
                    madera += maderaRecogida;
                    System.out.println("Has recolectado " + maderaRecogida + " unidades de madera.");
                } catch (Exception e) {
                    System.out.println("Ha ocurrido un error al recolectar madera.");
                }
                break;
            case 2:
                try {
                    int piedraRecogida = (int) (Math.random() * 5) + 1;
                    piedra += piedraRecogida;
                    System.out.println("Has recolectado " + piedraRecogida + " unidades de piedra.");
                } catch (Exception e) {
                    System.out.println("Ha ocurrido un error al recolectar piedra.");
                }
                break;
            case 3:
                try {
                    int metalRecogido = (int) (Math.random() * 5) + 1;
                    metal += metalRecogido;
                    System.out.println("Has recolectado " + metalRecogido + " unidades de metal.");
                } catch (Exception e) {
                    System.out.println("Ha ocurrido un error al recolectar metal.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }


    public boolean atacarOgro(Ogro ogro) {
        boolean ogroDerrotado = false;
        int danio = 10 * nivel;

        ogro.recibirAtaque(danio);

        if (ogro.getVida() <= 0) {
            ogroDerrotado = true;
        }

        return ogroDerrotado;
    }

    public boolean restarVida(int cantidad) {
        vida -= cantidad;
        if (vida <= 0) {
            System.out.println("¡Lo siento, has perdido! El ogro te ha derrotado");
            return true;
        }
        return false;
    }

    public boolean restarPoderMago(Mago mago) {
        boolean magoDerrotado = false;

        mago.restarPoder(poder * 5);

        if (mago.getPoder() <= 0) {
            magoDerrotado = true;
        }

        return magoDerrotado;
    }

    public boolean recibirAtaque(int poder) {
        boolean jugadorGolpeado = false;

        vida -= poder;

        if (vida <= 0) {
            jugadorGolpeado = true;
        }

        return jugadorGolpeado;
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
    public int getNivel() {
        return nivel;
    }

    public int getHadasRescatadas() {
        return hadasRescatadas;
    }

    public int getCasasConstruidas() {
        return casasConstruidas;
    }

    public int getVida() {
        return vida;

    }

    public int getPoder() {
        return this.poder;
    }
}
