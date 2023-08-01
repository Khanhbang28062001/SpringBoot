package org.example;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> listNameUserById = new HashMap<>();

        listNameUserById.put(5, "Anna");
        listNameUserById.put(1, "John");
        listNameUserById.put(7, "Chris");
        listNameUserById.put(4, "Ryan");

        System.out.println("New map: ");
        for (Map.Entry<Integer, String> nameUserByID : listNameUserById.entrySet()) {
            System.out.println(nameUserByID.getKey() + nameUserByID.getValue());
        }

        listNameUserById.put(4, "Scarlett");
        System.out.println("Add element: ");
        System.out.println(listNameUserById);

        listNameUserById.remove(5);
        System.out.println("Map after remove element: ");
        System.out.println(listNameUserById);
    }
}
