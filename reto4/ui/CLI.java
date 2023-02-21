package edu.diego.arzate.torres.reto4.ui;

import edu.diego.arzate.torres.reto4.process.ChartSells;

import java.util.ArrayList;

/**
 * Manda a llamar los metodos de CharSells
 * se alamcenan los valores de la tabla y se encarga de realizar las respectivas sumas de los arrays
 *
 */
public class CLI {
    /**
     * son los arrays
     */
    static String [] flavors ={"Chocolate","Vanilla","Strawberry","Oreo"};
static String [] quarter ={"January-March","April-june","July-September","October-December"};
     static double[][]chart= {
            {111, 483, 471, 427},
            {192, 500, 355, 158},
            {289, 470, 474, 160},
            {415, 114, 161, 308}
    };

    /**
     * Este establece los arrays de sabores y trimestres para ser sustituidos por su posicion en la tabla y luego ser mostrados
     */

     public static void showresults(){
     for (int i = 0; i < flavors.length; i++) {
         ArrayList<Integer> max = (ArrayList<Integer>) ChartSells.ObtainBestQuarterbyFlavor(chart);
         System.out.println("El trimestre que mejores ventas tuvo del sabor " + flavors[i] + " fue:  " + quarter[max.get(i)]);
     }
     System.out.println();

     System.out.println("El mejor trimestre fue: " +
             quarter[ChartSells.ObtainBestQuarterbySells(chart)]);
     }
}
