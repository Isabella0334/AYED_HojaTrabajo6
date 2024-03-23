
/*
*   UNIVERSIDAD DEL VALLE DE GUATEMALA
*   ALGORITMOS Y ESTRUCTURA DE DATOS
*   CC2016
*   AUTORES:
            Milton Giovanni Polanco Serrano
            Isabella Recinos Rodríguez
    FECHA: Viernes 22 de marzo del año 2024
    DESCRIPCIÓN: Hoja de trabajo 6
    LINK A REPOSITORIO: https://github.com/Isabella0334/AYED_HojaTrabajo6.git
*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.swing.UIManager;

public class Main {
    private static StudentManager studentManager;
    private static MapFactory<String, Student> mapFactory = new MapFactory<>();
    private static HashFunctionFactory hashFunctionFactory = new HashFunctionFactory();

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Es necesario cargar los datos antes de proceder:");
        cargarDatos(scanner);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Cargar Datos");
            System.out.println("2. Buscar Estudiante por Llave");
            System.out.println("3. Buscar Estudiantes por Nacionalidad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        cargarDatos(scanner);
                        break;
                    case 2:
                        buscarEstudiante(scanner);
                        break;
                    case 3:
                        buscarPorNacionalidad(scanner);
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        scanner.close();
    }

    private static void cargarDatos(Scanner scanner) {
        System.out.println("Seleccione el tipo de mapa (HashMap, TreeMap, LinkedHashMap):");
        String mapType = scanner.nextLine();
        System.out.println("Seleccione el tipo de función hash (MD5, SHA-1, Organic):");
        String hashType = scanner.nextLine();

        studentManager = new StudentManager();
        List<Student> students = FileReader.readStudentsFromFile("estudiantes.json.json");
        IHashFunction hashFunction = hashFunctionFactory.getHashFunction(hashType);

        try (FileWriter writer = new FileWriter("Llaves.txt")) {
            for (Student student : students) {
                String key = hashFunction.hash(student.getEmail());
                studentManager.agregarEstudiante(key, student);
                writer.write(key + "\n");
            }
            System.out.println("Datos cargados correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo Llaves.txt");
            e.printStackTrace();
        }
    }

    private static void buscarEstudiante(Scanner scanner) {
        System.out.print("Ingrese la llave del estudiante (correo electrónico): ");
        String llave = scanner.nextLine();
        Student student = studentManager.buscarPorLlave(llave);
        if (student != null) {
            System.out.println("Estudiante encontrado: " + student);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static void buscarPorNacionalidad(Scanner scanner) {
        System.out.print("Ingrese la nacionalidad para buscar estudiantes: ");
        String nacionalidad = scanner.nextLine();
        List<Student> students = studentManager.buscarPorNacionalidad(nacionalidad);
        if (students.size() > 0) {
            System.out.println("Estudiantes encontrados:");
            for (Student student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("No se encontraron estudiantes de esa nacionalidad.");
        }
    }
}
