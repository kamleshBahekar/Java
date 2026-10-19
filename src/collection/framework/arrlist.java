package collection.framework;

import java.util.ArrayList;
import java.util.Iterator;

public class arrlist {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        ArrayList<String> str = new ArrayList<>();
        str.add("kamlesh");
        str.add("kedar");
        str.add("priti");
        str.add("rashi");
        Iterator<String> itr = str.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
