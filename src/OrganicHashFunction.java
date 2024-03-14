public class OrganicHashFunction implements IHashFunction {
    public String hash(String input) {
        // La versión orgánica simplemente devuelve el mismo dato de entrada.
        return input;
    }
}
