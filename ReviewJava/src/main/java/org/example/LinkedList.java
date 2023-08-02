package org.example;

import java.util.Queue;

public class LinkedList {
    public void queueByLinkedList() {
        Queue<Integer> numbers = new java.util.LinkedList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.offer(25);

        System.out.println("First list: ");
        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }
        System.out.println("\nFirst element peek: " + numbers.peek());
        System.out.println("First element: " + numbers.poll());
        System.out.println("List after remove: ");

        for (Integer i : numbers) {
            System.out.print(i + "\t");
        }
    }
}
