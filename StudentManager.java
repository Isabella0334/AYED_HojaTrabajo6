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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentManager {
    private Map<String, Student> estudiantes;

    public StudentManager() {
        this.estudiantes = new HashMap<>();
    }

    public void agregarEstudiante(String llave, Student estudiante) {
        estudiantes.put(llave, estudiante);
    }

    // Buscar estudiantes por su nacionalidad.
    public List<Student> buscarPorNacionalidad(String nacionalidad) {
        return estudiantes.values().stream()
                .filter(estudiante -> estudiante.getCountry().equalsIgnoreCase(nacionalidad))
                .collect(Collectors.toList());
    }

    public Student buscarPorLlave(String llave) {
        return estudiantes.get(llave);
    }

}
