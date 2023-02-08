package edu.diego.arzate.torres.reto3.process;

import edu.diego.arzate.torres.reto3.ui.CLI;

import static edu.diego.arzate.torres.reto3.ui.CLI.numero;

public class conversor {
    public static int Binario;


        public static class conversorunidades {

            public static int conversorDaB (numero) {
                Binario = 0;
                long digito;
                final int divisor = 2;
                for (long i = Long.parseLong(numero), j = 0; i > 0; i /= divisor, i++) {
                    digito = i % divisor;
                    Binario += digito * Math.pow(10, j);
                }
                return Binario;
            }
        }

}