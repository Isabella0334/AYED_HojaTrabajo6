import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentManager {
    // Esta es la declaración de la colección que contendrá a los estudiantes.
    private Map<String, Student> estudiantes;

    public StudentManager() {
        this.estudiantes = new HashMap<>();
    }

    public void agregarEstudiante(String llave, Student estudiante) {
        estudiantes.put(llave, estudiante);
    }

    // Método para buscar estudiantes por su nacionalidad.
    public List<Student> buscarPorNacionalidad(String nacionalidad) {
        return estudiantes.values().stream()
                .filter(estudiante -> estudiante.getCountry().equalsIgnoreCase(nacionalidad))
                .collect(Collectors.toList());
    }
}
