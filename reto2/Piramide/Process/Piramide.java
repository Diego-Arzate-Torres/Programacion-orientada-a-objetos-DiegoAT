/**
 * Este se encarga de realizar los calculos para hacer la piramide
 * El primer for de definir la altura respecto al numero de asteriscos que indica el usuario
 * El segundo for se encarga de definir los espacios en blanco que va a dejar con respecto al numero de asteriscos y la altura
 *El tercer for se encarga de imprimir los asteriscos con respecto a la altura de la piramide junto con la variable asteriscos
 *
 *
 */

package edu.diego.arzate.torres.reto2.Piramide.Process;

public class Piramide{
    public static void piramideancho(int numasteriscos) {

        System.out.println();

        for (int altpiramide = 1; altpiramide <= numasteriscos; altpiramide++) {
            for (int espacios = 1; espacios <= numasteriscos - altpiramide; espacios++) {
                System.out.print(" ");
            }
            for (int asteriscos = 1; asteriscos <= (altpiramide * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

