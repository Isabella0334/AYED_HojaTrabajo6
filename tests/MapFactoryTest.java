
/*
*   UNIVERSIDAD DEL VALLE DE GUATEMALA
*   ALGORITMOS Y ESTRUCTURA DE DATOS
*   CC2016
*   AUTORES:
            Milton Giovanni Polanco Serrano
            Isabella Recinos Rodríguez
    FECHA: Jueves 14 de marzo del año 2024
    DESCRIPCIÓN: Hoja de trabajo 6
    LINK A REPOSITORIO: https://github.com/Isabella0334/AYED_HojaTrabajo6.git
*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

public class MapFactoryTest {

    @Test
    public void testHashMapInitialization() {
        MapFactory factory = new MapFactory();
        Assert.assertTrue(factory.getMap("HashMap") instanceof HashMap);
    }

    @Test
    public void testTreeMapInitialization() {
        MapFactory factory = new MapFactory();
        Assert.assertTrue(factory.getMap("TreeMap") instanceof TreeMap);
    }

    @Test
    public void testLinkedHashMapInitialization() {
        MapFactory factory = new MapFactory();
        Assert.assertTrue(factory.getMap("LinkedHashMap") instanceof LinkedHashMap);
    }

    @Test
    public void testInsertionAndRetrieval() {
        MapFactory factory = new MapFactory();
        Map<String, String> map = factory.getMap("HashMap");
        map.put("key1", "value1");
        map.put("key2", "value2");

        Assert.assertEquals(2, map.size());
        Assert.assertEquals("value1", map.get("key1"));
        Assert.assertEquals("value2", map.get("key2"));
        Assert.assertNull(map.get("unknownKey"));
    }

    @Test
    public void testRemoval() {
        MapFactory factory = new MapFactory();
        Map<String, String> map = factory.getMap("HashMap");
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.remove("key1");

        Assert.assertEquals(1, map.size());
        Assert.assertNull(map.get("key1"));
    }

}
