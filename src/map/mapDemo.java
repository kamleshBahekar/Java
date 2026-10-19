package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class mapDemo {
    static void main(String[] args) {
        // Hashmap null only one  key allowed
        Map<Integer,String> map = new HashMap<>();
        //Put
        map.put(1,"kamlesh");
        map.put(2,"priti");
        map.put(3,"rashi");
        System.out.println(map);
        //get
        System.out.println(map.get(2));
        //remove
        System.out.println(map.remove(1));
        System.out.println(map);
        // Duplicate key concept
        map.put(2,"Rahul");
        System.out.println(map);
        // null key or null value
        map.put(null,"riya");
        map.put(4,null);
        System.out.println(map);
        Map<Integer,String> Table = new Hashtable<>();
        Table.put(1,"Ruchi");
        System.out.println(Table);
    }
}
