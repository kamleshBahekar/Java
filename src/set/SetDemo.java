package set;

import java.util.*;

public class SetDemo {
    static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println("HashSet "+set);
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(121);
        set1.add(23);
        set1.add(33);
        System.out.println("linkedHashSet"+set1);
        SortedSet sortedSet = new TreeSet<>();
        sortedSet.add(12);
        sortedSet.add(22);
        sortedSet.add(23);
        sortedSet.add(34);
        System.out.println("sortedSet"+sortedSet);
        System.out.println("sortedSet first "+sortedSet.first());
    }
}
