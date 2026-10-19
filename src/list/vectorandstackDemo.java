package list;

import java.util.Stack;
import java.util.Vector;

public class vectorandstackDemo {
    static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(20);
        vector.add(43);
        System.out.println(vector);

        Stack<Integer> stack = new Stack<>();
        stack.push(90);
        stack.push(70);
        stack.push(60);
        stack.pop();
//        stack.peek();
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
