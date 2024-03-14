public class HashFunctionFactory {
    public static IHashFunction getHashFunction(String type) {
        switch (type) {
            case "MD5":
                return new MD5HashFunction();
            case "SHA-1":
                return new SHA1HashFunction(); // Asume que existe esta clase
            case "Organic":
                return new OrganicHashFunction();
            default:
                throw new IllegalArgumentException("Unknown hash function type: " + type);
        }
    }
}