package reto10.ui;
import reto10.process.*;
public class CLI {
    /**
     * este se encarga de darle los datos a los atributos anteriores, dependiendo de que requieran, asi como de realizar un test a aquellas clases que lo requieran
     */
    public static void showMenu() {
        JrEngineer jr1 = new JrEngineer("William", "Afton", 40, 331234560, 85627381, "Java, C#, Python", 5);
        SrEnginner sr1 = new SrEnginner("Jose", "Pescado", 21, 339888292, 923810292, "Cg, C++, C, Ruby, Fortran", 7);
        Manager manager1 = new Manager("Henry", "Pipila", 23, 339281029, 92001920, 43288);
        CEO ceo1 = new CEO("Douglas", "Winston", 38, 333443568, 920117327, 932920, 9);
        HR hr1 = new HR("Emanuel", "Boiler", 31, 336728271, 920319201, 23);

        JrEngineer jr2 = new SrEnginner("Francisco", "Usurpado", 21, 331452638, 837201929, "HTML5, CSS, PHP, C++", 4);
        Manager ceo2 = new CEO("Gerardo", "Tungsteno", 47, 336655392, 278327281, 37880, 7);
        JrEngineer jr3 = new SrEnginner("Horacio", "Solomon", 29, 334566271, 903283481, "Java, C#, CSS, PHP, C++, Ruby, Fortran", 6);

        testEmployee(jr1);
        testEmployee(manager1);
        System.out.println();

        testProgrammer(sr1);
        testProgrammer(hr1);
        System.out.println();

        testInterviewer(jr2);
        testInterviewer(sr1);
    }

    /**
     * Estos se encargan de hacer el test, asi como de hacer saber a la persona si es o no es un empleaod, esto usando los tests anteriores
     * @param object
     */
    public static void testEmployee(Object object) {
        if (object instanceof Employee) {
            System.out.println("El objeto es un empleado");
        } else {
            System.out.println("El objeto no es un empleado");
        }
    }

    public static void testProgrammer(Object object) {
        if (object instanceof Programmer) {
            System.out.println("El empleado es un programador");
        } else {
            System.out.println("El empleado no es un programador");
        }
    }

    public static void testInterviewer(Object object) {
        if (object instanceof Interviewer) {
            System.out.println("El empleado es un entrevistador");
        } else {
            System.out.println("El empleado no es un entrevistador");
        }
    }
}