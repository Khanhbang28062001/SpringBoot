package org.example.setInterface;

import java.util.Set;

public class EnumSet {
    enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Set<Days> set1 = EnumSet.of(Days.MONDAY, Days.TUESDAY);
        System.out.println(set1);

        Set<Days> set2 = EnumSet.allOf(Days.class);
        System.out.println(set2);

        Set<Days> set3 = EnumSet.noneOf(Days.class);
    }
}
