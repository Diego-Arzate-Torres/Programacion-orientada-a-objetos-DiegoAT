package reto12.ui;
import reto12.process.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class CLI {
    /**
     * este se encarga de darle los datos a los atributos anteriores, dependiendo de que requieran, asi como de realizar un test a aquellas clases que lo requieran
     */
    public static void showMenu() {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new JrEngineer("William", "Afton", "aksjsakjsdkjhdsak", 40, 331234560, 85627381, "Java, C#, Python", 5));
        list.add(new JrEngineer("Francisco", "Usurpado", "JHDSAKHDSAKJ", 21, 331452638, 837201929, "HTML5, CSS, PHP, C++", 4));
        list.add(new JrEngineer("Horacio", "Solomon", "jhdakhdksja", 29, 334566271, 903283481, "Java, C#, CSS, PHP, C++, Ruby, Fortran", 6));
        list.add(new JrEngineer("Sofia", "Garcia", "aksjsakjsdkjhdsak", 40, 331234560, 85627381, "Java, C#, Python", 5));
        list.add(new JrEngineer("Mateo", "Rodriguez", "JHDSAKHDSAKJ", 21, 331452638, 837201929, "HTML5, CSS, PHP, C++", 4));
        list.add(new JrEngineer("Valentina", "Martinez", "jhdakhdksja", 29, 334566271, 903283481, "Java, C#, CSS, PHP, C++, Ruby, Fortran", 6));
        list.add(new JrEngineer("Santiago", "Lopez", "aksjsakjsdkjhdsak", 40, 331234560, 85627381, "Java, C#, Python", 5));
        list.add(new JrEngineer("Isabella", "Perez", "JHDSAKHDSAKJ", 21, 331452638, 837201929, "HTML5, CSS, PHP, C++", 4));
        list.add(new JrEngineer("Alejandro", "Gomez", "jhdakhdksja", 29, 334566271, 903283481, "Java, C#, CSS, PHP, C++, Ruby, Fortran", 6));
        list.add(new JrEngineer("Samuel", "Sanchez", "jhdakhdksja", 29, 334566271, 903283481, "Java, C#, CSS, PHP, C++, Ruby, Fortran", 6));

        String fileName = "testWRITEFile.txt";
        Path file = Paths.get(fileName);
        try {
            List<String> lines = list
                    .stream()
                    .map(Employee::toString)
                    .collect(Collectors.toList());
            Files.write(file, lines);;

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    public static void testReadFiles() {
        ArrayList<Employee> readList = new ArrayList<>();
        String fileName = "Employees.txt";
        Path file = Paths.get(fileName);

        try {

            for (String line : Files.readAllLines(file)) {
                List<String> lines = readList
                        .stream()
                        .map(Employee::toString)
                        .collect(Collectors.toList());
                System.out.println(line);
                List<Employee> employeesOver20 = new ArrayList<>();
                for (int i =0; i < line.length(); i++){

                    employeesOver20.add(new JrEngineer());
                    printOver20Emp(employeesOver20);
                }
            }
                System.out.println("------------------");



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        static List<Employee> printOver20Emp (List < Employee > employees) {
        List<Employee> employeesOver20 = Collections.emptyList();
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getAge() > 20) {
                    System.out.println(employees.get(i));
                    employeesOver20.add(employees.get(i));
                }

            }return employeesOver20;

        }


        static void work (Employee employee){

        }

        static void program (Programmer programmer){

        }

        static void interview (Interviewer interviewer){
        }



}
