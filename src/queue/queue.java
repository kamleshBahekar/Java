package queue;

import java.util.*;

public class queue {
    static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(20);
        que.offer(30);
        que.offer(40);
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.peek());
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(40);
        pq.offer(88);
        pq.offer(50);
        System.out.println("PriorityQueue"+pq);
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        System.out.println("ArrayDeque"+dq);
    }
}

