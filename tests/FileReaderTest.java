import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FileReaderTest {

    @Test
    public void testReadStudentsFromFile() {
        String filename = "estudiantes_prueba.json";

        List<Student> students = FileReader.readStudentsFromFile(filename);

        // Verifica el resultado
        assertNotNull("La lista de estudiantes no debería ser null", students);
        assertFalse("La lista de estudiantes no debería estar vacía", students.isEmpty());

        assertEquals("Debería haber un número específico de estudiantes en la lista", 3, students.size());

        Student firstStudent = students.get(0);
        assertEquals("El nombre del primer estudiante debería ser 'Daria Haney'", "Daria Haney",
                firstStudent.getName());
        assertEquals("El correo electrónico del primer estudiante debería ser 'nam.ac@protonmail.org'",
                "nam.ac@protonmail.org", firstStudent.getEmail());
    }
}
