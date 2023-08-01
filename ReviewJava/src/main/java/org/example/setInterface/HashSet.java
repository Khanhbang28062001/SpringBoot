package org.example.setInterface;

import java.util.Set;

public class HashSet {
    public void hashSet(){
        Set<Integer> list = new java.util.HashSet<>();
        System.out.println(list);

        list.add(5);
        list.add(1);
        list.add(7);
        list.add(3);
        System.out.println(list);

        list.clear();
        list.add(3);
        System.out.println(list);

        list.remove(7);
        System.out.println("Set after remove element in set: " + list);
    }
}
