import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

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
