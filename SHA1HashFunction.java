
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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1HashFunction implements IHashFunction {
    public String hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            return byteArrayToHex(md.digest(input.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private String byteArrayToHex(byte[] a) {
        StringBuilder sb = new StringBuilder(a.length * 2);
        for (byte b : a)
            sb.append(String.format("%02x", b));
        return sb.toString();
    }
}