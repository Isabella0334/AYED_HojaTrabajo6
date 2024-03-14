public class EstudianteManager {
    private Map<String, Estudiante> estudiantes;

    public EstudianteManager() {
        this.estudiantes = new HashMap<>(); // O cualquier otro tipo de Map según necesidad
    }

    public void agregarEstudiante(String llave, Estudiante estudiante) {
        estudiantes.put(llave, estudiante);
    }

    public Estudiante buscarPorLlave(String llave) {
        return estudiantes.get(llave);
    }
}
