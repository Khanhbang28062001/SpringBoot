package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public void PriorityQueueExample() {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);

        System.out.println("init list: ");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }

        System.out.println("\nFirst element: " + numbers.poll());
        System.out.println("First element: " + numbers.poll());

        numbers.offer(1);
        System.out.println("\nInit list: ");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }
    }
}
