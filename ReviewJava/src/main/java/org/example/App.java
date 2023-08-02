package org.example;

public class App {
    public static void main(String[] args) {
        LinkedList queueLinkedList = new LinkedList();
        queueLinkedList.queueByLinkedList();

        System.out.println("\n");

        PriorityQueueEx priorityQueueExList = new PriorityQueueEx();
        priorityQueueExList.PriorityQueueExample();

        System.out.println("\n");

        PriorityBlockingQueueEx priorityBlockingQueueEx = new PriorityBlockingQueueEx();
        priorityBlockingQueueEx.examplePriorityBlockingQueue();
    }
}
