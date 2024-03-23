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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory<K, V> {
    public Map<K, V> getMap(String type) {
        switch (type) {
            case "HashMap":
                return new HashMap<>();
            case "TreeMap":
                return new TreeMap<>();
            case "LinkedHashMap":
                return new LinkedHashMap<>();
            default:
                return null;
        }
    }
}
