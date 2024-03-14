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