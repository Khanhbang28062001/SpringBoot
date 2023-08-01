package org.example.setInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public void linkedHashSetEx() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");
        linkedHashSet.add("grape");
        linkedHashSet.add("apple");

        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}
