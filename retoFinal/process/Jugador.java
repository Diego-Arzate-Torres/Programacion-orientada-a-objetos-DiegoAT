package edu.diego.arzate.torres.retoFinal.process;


import java.util.Scanner;
/**
 La clase Jugador representa a un jugador en el juego. El jugador tiene un nivel, un número de hadas rescatadas,
 un número de casas construidas, una cantidad de vida, un poder, y una cantidad de recursos como madera, piedra y metal.
 */
public class Jugador {
/**
 * Estos ints ayudan que los metodos funcionen, asi como a predeterminar sus valores
 */

    private int nivel;
    private int hadasRescatadas;
    private int casasConstruidas;
    private int vida;
    private int poder;
    private int madera;
    private int piedra;
    private int metal;


    /**
     Crea un nuevo jugador con valores iniciales predeterminados. El nivel es 1, no se han rescatado hadas,
     no se han construido casas, la vida es 100, el poder es 10, y no se posee ningún recurso.
     */
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
    /**
     Método que permite al jugador construir una casa si tiene suficientes recursos.
     Resta 10 unidades de madera, piedra y metal del jugador.
     Si el jugador no tiene suficientes recursos, muestra un mensaje de error.
     Si el jugador tiene suficientes recursos, muestra un mensaje de éxito y finaliza el juego.
     */
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
    /**
     Método que resta la cantidad de madera especificada al jugador.
     Si el jugador no tiene suficiente madera, muestra un mensaje de error.
     Si el jugador tiene suficiente madera, resta la cantidad especificada y muestra un mensaje de éxito.
     @param cantidad la cantidad de madera a restar.
     */
    public void restarMadera(int cantidad) {
        if (this.madera < cantidad) {
            System.out.println("No tienes suficiente madera.");
        } else {
            this.madera -= cantidad;
            System.out.println("Has restado " + cantidad + " unidades de madera.");
        }
    }
    /**
     Método que resta la cantidad de piedra especificada al jugador.
     Si el jugador no tiene suficiente piedra, muestra un mensaje de error.
     Si el jugador tiene suficiente piedra, resta la cantidad especificada y muestra un mensaje de éxito.
     @param cantidad la cantidad de piedra a restar.
     */
    public void restarPiedra(int cantidad) {
        if (this.piedra < cantidad) {
            System.out.println("No tienes suficiente Piedra.");
        } else {
            this.piedra -= cantidad;
            System.out.println("Has restado " + cantidad + " unidades de piedra.");
        }
    }
    /**
     Resta la cantidad especificada de materiales de metal del inventario del jugador.
     Si la cantidad especificada es mayor que la cantidad de metal en el inventario, se imprimirá un mensaje de error.
     @param cantidad la cantidad de metal a restar del inventario del jugador.
     */
    public void restarMetal(int cantidad) {
        if (this.metal < cantidad) {
        System.out.println("No tienes suficiente Metal.");
    } else {
        this.metal -= cantidad;
        System.out.println("Has restado " + cantidad + " unidades de Metal.");
        }
    }
    /**
     * Incrementa el contador de hadas rescatadas si aún no ha alcanzado el máximo de 3.
     * Si se alcanza el máximo, se muestra un mensaje de que ya no hay más hadas para rescatar.
     */
    public void rescatarHada() {
        if (hadasRescatadas < 3) {
            hadasRescatadas++;
            System.out.println("¡Has rescatado a un hada! Ya tienes " + hadasRescatadas + " de 3.");
        } else {
            System.out.println("Ya has rescatado a todas las hadas posibles.");
        }
    }

    /**
     * Incrementa el nivel del jugador y su poder en 5.
     */
    public void aumentarNivel() {
        nivel++;
        poder += 5;
    }
    /**
     * Retorna la cantidad de madera que tiene el jugador.
     * @return la cantidad de madera que tiene el jugador.
     */
    public int getMadera() {
        return madera;
    }
    /**
     * Retorna la cantidad de piedra que tiene el jugador.
     * @return la cantidad de piedra que tiene el jugador.
     */
    public int getPiedra() {
        return piedra;
    }
    /**
     * Retorna la cantidad de metal que tiene el jugador.
     * @return la cantidad de metal que tiene el jugador.
     */
    public int getMetal() {
        return metal;
    }
    /**
     Método para recolectar materiales. Permite al jugador recolectar materiales de acuerdo a su elección.
     La cantidad de material recolectado es generada aleatoriamente.
     El jugador puede recolectar madera, piedra o metal.
     El método actualiza los valores de las variables madera, piedra y metal.
     */
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
    /**
     * Ataca al ogro y determina si este ha sido derrotado.
     * @param ogro el ogro a atacar
     * @return true si el ogro ha sido derrotado, false en caso contrario
     */

    public boolean atacarOgro(Ogro ogro) {
        boolean ogroDerrotado = false;
        int daño = 10 * nivel;

        ogro.recibirAtaque(daño);

        if (ogro.getVida() <= 0) {
            ogroDerrotado = true;
        }

        return ogroDerrotado;
    }
    /**
     * Resta una cantidad de vida al jugador y determina si este ha sido derrotado.
     * @param cantidad la cantidad de vida a restar
     * @return true si el jugador ha sido derrotado, false en caso contrario
     */
    public boolean restarVida(int cantidad) {
        vida -= cantidad;
        if (vida <= 0) {
            System.out.println("¡Lo siento, has perdido! El ogro te ha derrotado");
            return true;
        }
        return false;
    }
    /**
     * Resta una cantidad de poder al mago y determina si este ha sido derrotado.
     * @param mago el mago a atacar
     * @return true si el mago ha sido derrotado, false en caso contrario
     */
    public boolean restarPoderMago(Mago mago) {
        boolean magoDerrotado = false;

        mago.restarPoder(poder * 2);

        if (mago.getPoder() <= 0) {
            magoDerrotado = true;
        }

        return magoDerrotado;
    }
    /**
     * Recibe un ataque y determina si el jugador ha sido golpeado.
     * @param poder el poder del ataque recibido
     * @return true si el jugador ha sido golpeado, false en caso contrario
     */
    public boolean recibirAtaque(int poder) {
        boolean jugadorGolpeado = false;

        vida -= poder;

        if (vida <= 0) {
            jugadorGolpeado = true;
        }

        return jugadorGolpeado;
    }
    /**
     * Resta la cantidad especificada de poder al jugador. Si la cantidad es mayor al poder del jugador,
     * el poder se establece en 0 y se devuelve true indicando que el jugador ha sido derrotado.
     * Si la cantidad es menor o igual al poder del jugador, se resta la cantidad del poder y se devuelve false.
     * @param cantidad la cantidad de poder a restar al jugador.
     * @return true si el jugador ha sido derrotado, false de lo contrario.
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
     * Devuelve el nivel actual del jugador.
     * @return el nivel actual del jugador.
     */
    public int getNivel() {
        return nivel;
    }
    /**
     * Devuelve la cantidad de hadas que el jugador ha rescatado.
     * @return la cantidad de hadas rescatadas.
     */
    public int getHadasRescatadas() {
        return hadasRescatadas;
    }
    /**
     * Devuelve la cantidad de casas que el jugador ha construido.
     * @return la cantidad de casas construidas.
     */
    public int getCasasConstruidas() {
        return casasConstruidas;
    }
    /**
     * Devuelve la cantidad actual de vida del jugador.
     * @return la cantidad actual de vida del jugador.
     */
    public int getVida() {
        return vida;

    }
    /**
     * Devuelve la cantidad actual de poder del jugador.
     * @return la cantidad actual de poder del jugador.
     */
    public int getPoder() {
        return this.poder;
    }
}
