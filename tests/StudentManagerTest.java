import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StudentManagerTest {
    private StudentManager manager;

    @Before
    public void setUp() {
        // Inicializar StudentManager
        manager = new StudentManager();
        manager.agregarEstudiante("nam.ac@protonmail.org",
                new Student("Daria Haney", "(152) 634-6056", "nam.ac@protonmail.org", "25326", "Nigeria"));
        manager.agregarEstudiante("luctus.lobortis.class@aol.edu",
                new Student("Ethan Hancock", "(677) 452-6975", "luctus.lobortis.class@aol.edu", "472423", "Poland"));
        manager.agregarEstudiante("malesuada.ut@yahoo.com",
                new Student("Barbara Palmer", "1-310-384-2685", "malesuada.ut@yahoo.com", "21710", "South Africa"));
    }

    @Test
    public void testBuscarPorLlave() {
        Student result = manager.buscarPorLlave("nam.ac@protonmail.org");
        assertNotNull("El estudiante debería ser encontrado", result);
        assertEquals("El nombre del estudiante encontrado debería coincidir", "Daria Haney", result.getName());
        result = manager.buscarPorLlave("inexistente@correo.com");
        assertNull("No se debería encontrar el estudiante", result);
    }

    @Test
    public void testBuscarPorNacionalidad() {
        List<Student> results = manager.buscarPorNacionalidad("Nigeria");
        assertNotNull("La lista de resultados no debería ser nula", results);
        assertEquals("Debería haber 1 estudiante de Nigeria", 1, results.size());
        results = manager.buscarPorNacionalidad("Inexistente");
        assertTrue("La lista de estudiantes debería estar vacía", results.isEmpty());
    }
}
