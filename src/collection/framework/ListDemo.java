package collection.framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(10);
        list.add(4);
        list.add(2);

        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list.size());
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(int val:list){
            System.out.println(val);
        }
    }
}
