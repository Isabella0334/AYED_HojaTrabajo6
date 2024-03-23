
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

public class HashFunctionFactory {
    public static IHashFunction getHashFunction(String type) {
        switch (type) {
            case "MD5":
                return new MD5HashFunction();
            case "SHA-1":
                return new SHA1HashFunction();
            case "Organic":
                return new OrganicHashFunction();
            default:
                throw new IllegalArgumentException("Tipo de función Hash desconocida: " + type);
        }
    }
}