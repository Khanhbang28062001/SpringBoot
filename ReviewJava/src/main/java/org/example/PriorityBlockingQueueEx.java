package org.example;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueEx {
    public void examplePriorityBlockingQueue(){
        Queue<Integer> numbers = new PriorityBlockingQueue<>();
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);

        System.out.println("Init list: ");
        System.out.println(numbers);

        System.out.println("\nFirst element: " + numbers.poll());

        numbers.offer(1);
        System.out.println("List after add element: ");
        System.out.println(numbers);

        System.out.println("Fist element of new list: " +numbers.peek());
    }
}
