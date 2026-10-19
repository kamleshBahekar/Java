package collection.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIteratorDemo {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> itr = list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------");
        // Backward traversal
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        // Add 25 after 20
        while (itr.hasNext()) {
            int num = itr.next();

            if (num == 20) {
                itr.add(25);
            }
        }

        System.out.println("After add(): " + list);

        // Replace 20 with 25
        itr = list.listIterator();

        while (itr.hasNext()) {
            int num = itr.next();

            if (num == 20) {
                itr.set(25);
            }
        }

        System.out.println("After set(): " + list);

        // Remove 10
        itr = list.listIterator();

        while (itr.hasNext()) {
            int num = itr.next();

            if (num == 10) {
                itr.remove();
            }
        }

        System.out.println("After remove(): " + list);

    }
}
