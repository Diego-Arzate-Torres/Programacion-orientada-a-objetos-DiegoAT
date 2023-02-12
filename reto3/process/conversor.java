/**
 * @author Diego Arzate Torres
 * @param conversor (todos los conversores) se encargan de convertir los valores dados por el usuario a convertir dependiendo de lo que haya decidido a convertir
 * @param numero (todos los nums) estos se encargan de poner el numero ingresado en alguna de las conversiones, dependiendo claro de que conversion haya elegido el usuario
 */
package edu.diego.arzate.torres.reto3.process;



public class conversor {


    public static String conversorDaB (long numero) {

        if (numero <= 0) {
            return "0";
        }
       StringBuilder Binario = new StringBuilder();
        while (numero > 0) {
            short residuo = (short) (numero % 2);
            numero = numero / 2;
            Binario.insert(0, String.valueOf(residuo));
        }
        return Binario.toString();

    }
    public static String conversorDaO(int numero2) {
        String octal = "";
        String caractererO = "01234567";
        while (numero2 > 0) {
            int residuo = numero2 % 8;


            octal = (caractererO.charAt(residuo) + octal);

            numero2 /= 8;
        }
        return octal;
    }

    public static String conversorDaH(int numero3) {
        String HD = "";
        String caracteresH = "0123456789ABCDEF";
        while (numero3 > 0) {
            int residuo2 = numero3 % 16;
            HD = caracteresH.charAt(residuo2) + HD;
            numero3 /= 16;
        }
        return HD;
    }

    public static long conversorBaD(String numeroB) {

        long numero2 = 0;
        int posicion = 0;

        for (int e = numeroB.length() - 1; e >= 0; e--) {

            short num = 1;
            if (numeroB.charAt(e) == '0') {
                num = 0;
            }


            double multiplicador = Math.pow(2, posicion);
            numero2 += num * multiplicador;
            posicion++;
        }
        return numero2;
    }
    public static long ConversorOaD(String O) {
        long numero3 = 0;
        int potenciador = 0;
        for (int i= O.length() - 1; i >= 0; i--) {
            int valor = Character.getNumericValue(O.charAt(i));
            long elevado = (long) Math.pow(8, potenciador) * valor;
            numero3 += elevado;
            potenciador++;
        }
        return numero3;
    }
    public static int caracterHaD(char character) {
        switch (character) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return Integer.parseInt(String.valueOf(character));
        }
    }

    public static long conversorHaD(String hexadecimal) {
        long numero4 = 0;

        int potenciador2 = 0;

        for (int x = hexadecimal.length() - 1; x >= 0; x--) {
            int valor = caracterHaD(hexadecimal.charAt(x));
            long elevar = (long) Math.pow(16, potenciador2) * valor;
            numero4 += elevar;

            potenciador2++;
        }
        return numero4;
    }
}

