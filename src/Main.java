import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("map1", 1);
        map.put("map2", 2);
        map.put("map3", 3);
        map.put("map4", 4);
        map.put("map5", 5);
        map.put("map6", 6);
        map.put("map7", 7);
        map.put("map8", 8);
        map.put("map9", 9);
        map.put("map10", 10);
        map.put("map11", 11);
        map.put("map12", 12);
        map.put("map13", 13);
        map.put("map14", 14);
        map.put("map15", 15);

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.printf("%s, %d%n",stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
    }
}