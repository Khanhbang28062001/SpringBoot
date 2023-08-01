package org.example.setInterface;

public class LinkedHashSet {
    public String linkedHashSetEx() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");
        linkedHashSet.add("grape");
        linkedHashSet.add("apple"); // Phần tử trùng lặp, sẽ không được thêm vào

        // In các phần tử trong tập hợp, giữ thứ tự chèn
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

    }
}
