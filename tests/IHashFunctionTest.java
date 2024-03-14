
// HashFunctionTest.java
import static org.junit.Assert.*;

import org.junit.Test;

public class IHashFunctionTest {

    @Test
    public void testOrganicHashFunction() {
        IHashFunction organic = new OrganicHashFunction();
        assertEquals("test", organic.hash("test"));
    }

    @Test
    public void testMD5HashFunction() {
        IHashFunction md5 = new MD5HashFunction();
        // Asegúrate de proporcionar el hash MD5 correcto para la cadena "test"
        assertEquals("098f6bcd4621d373cade4e832627b4f6", md5.hash("test"));
    }

    @Test
    public void testSHA1HashFunction() {
        IHashFunction sha1 = new SHA1HashFunction(); // Asume que existe esta clase
        // Asegúrate de proporcionar el hash SHA-1 correcto para la cadena "test"
        assertEquals("a94a8fe5ccb19ba61c4c0873d391e987982fbbd3", sha1.hash("test"));
    }
}
