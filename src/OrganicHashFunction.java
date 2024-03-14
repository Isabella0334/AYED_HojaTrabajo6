// OrganicHashFunction.java
public class OrganicHashFunction implements IHashFunction {
    @Override
    public String hash(String input) {
        // Devuelve el mismo dato que se ingresa
        return input;
    }
}
