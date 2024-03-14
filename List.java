import java.util.List;
import java.util.stream.Collectors;

public List<Student> buscarPorNacionalidad(String nacionalidad) {
    return estudiantes.values().stream()
            .filter(estudiante -> estudiante.getNacionalidad().equalsIgnoreCase(nacionalidad))
            .collect(Collectors.toList());
}
