package edu.diego.arzate.torres.reto4.process;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 * Esta clase se encarga de generar dos funciones las cuales a su vez se encargan de hacer las sumas necesarias
 */
public class ChartSells {
    /**
     * Lee los valores de la tabla y regresa el valor maximo de cada trimestre y sabor en un array
     * @param Chart2 Es la suma de los sabores
     * @return los valores maximos
     */

    public static List<Integer> ObtainBestQuarterbyFlavor(double[][] Chart2) {

        double max;
        int Index = 0;

        List<Integer> quarter = new ArrayList<>();
        for (int i = 0; i < Chart2.length; i++) {
            max = Double.MIN_VALUE;
            for (int j = 0; j < Chart2.length; j++) {
                if (Chart2[i][j] > max) {
                     if (Chart2[j][i] > max) {
                        max = Chart2[i][j];
                        Index = j;
                    }
                }
            }
            quarter.add(Index);
        }
        return quarter;
    }

    /**
     * suma los valores en el arregglos y devuelve la posicion
     * @param chart la tabla que se va a leer
     * @return Index2 es la suma más grande del trimestre, este se encarga de desplegar las mejores ventas por trimestre de todos los sabores en arrays
     */
    public static int ObtainBestQuarterbySells(double[][]chart){
        double max2 =0;
        int Index2 =0;


        for (int i = 0; i < chart.length; i++) {
            double add =0;
            for (int j = 0; j < chart.length; j++) {
                add += chart[j][i];
            }
                    if (add > max2) {
                        max2 = add;
                        Index2 = i;
                    }

            }

        return Index2;
    }
}