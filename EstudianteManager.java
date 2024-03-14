import java.util.HashMap;
import java.util.Map;

public class EstudianteManager {
    private Map<String, Student> estudiantes;

    public EstudianteManager() {
        this.estudiantes = new HashMap<>(); // O cualquier otro tipo de Map según necesidad
    }

    public void agregarEstudiante(String llave, Student estudiante) {
        estudiantes.put(llave, estudiante);
    }

    public Student buscarPorLlave(String llave) {
        return estudiantes.get(llave);
    }
}
