package reto11.ui;
import reto11.process.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
            Files.write(file, lines);
        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    static void testReadFiles() {
        ArrayList<Employee> readList = new ArrayList<>();
        String fileName = "Employees.txt";
        Path file = Paths.get(fileName);

        try {

            for(String line : Files.readAllLines(file)){
                List<String> lines = readList
                        .stream()
                        .map(Employee::toString)
                        .collect(Collectors.toList());
                lines.add(line);
                System.out.println(lines);
                System.out.println("------------------");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        static void printOver20Emp (List < String > lines, Employee employee){
            for (int i = 0; i < lines.size(); i++) {
                if (employee.getAge() > 20) {
                    System.out.println(lines);
                }

            }
        }


        static void work (Employee employee){

        }

        static void program (Programmer programmer){

        }

        static void interview (Interviewer interviewer){
        }



}
