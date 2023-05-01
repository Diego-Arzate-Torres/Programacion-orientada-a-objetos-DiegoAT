package reto12.ui;
import reto12.process.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class ClasePrueba {

    public static ArrayList<Employee> readEmployees(String nombreArchivo) throws IOException {
        ArrayList<Employee> empleados = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String name = datos[0];
                int age = Integer.parseInt(datos[1]);
                String RFC = datos[2];
                Employee empleado = new Employee(){
                    @Override
                    public void work() {

                    }
                };
                empleados.add(empleado);
            }
        }
        return empleados;
    }

    public static void main(String[] args) {
        try {
            ArrayList<Employee> empleados = Employee.readEmployees("empleados.txt");

            // Determinar cuántos empleados tienen entre 20 y 25 años de edad
            long cantidadEmpleados = empleados.stream()
                    .filter(e -> e.getAge() >= 20 && e.getAge() <= 25)
                    .count();
            System.out.println("Cantidad de empleados con edad entre 20 y 25 años: " + cantidadEmpleados);

            // Imprimir los primeros 10 empleados de la lista ordenada alfabéticamente
            empleados.stream()
                    .sorted(Comparator.comparing(Employee::getName))
                    .limit(10)
                    .forEach(e -> System.out.println(e.getName()));

            // Encontrar el promedio de edad de todos los empleados
            double promedioEdad = empleados.stream()
                    .mapToInt(Employee::getAge)
                    .average()
                    .orElse(Double.NaN);
            System.out.println("Promedio de edad de todos los empleados: " + promedioEdad);

            // Encontrar el último empleado de la lista si esta tiene como primer criterio de ordenamiento la edad y segundo criterio el nombre (alfabéticamente)
            Employee ultimoEmpleado = empleados.stream()
                    .sorted(Comparator.comparingInt(Employee::getAge).reversed().thenComparing(Employee::getName))
                    .findFirst()
                    .orElse(null);
            System.out.println("Último empleado de la lista: " + ultimoEmpleado.getName());

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}

