package collection.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class interatorDemo {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            int number = itr.next();

            if (number == 30) {
                itr.remove();
            }
        }

        System.out.println(list);
    }
}
