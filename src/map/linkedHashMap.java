package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Python");
        map.put(2,"Java");
        map.put(3,"Javascript");
        System.out.println(map);
    }
}
