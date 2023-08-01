package org.example.setInterface;
import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
    enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,Cherry, Apple, Banana
    }
    enum Fruit{
        Orange, Cherry, Apple, Banana
    }

    public String enumSet() {
        EnumSet<Days> workingDays = EnumSet.of(Days.MONDAY, Days.TUESDAY,Days.Apple);
        System.out.println(workingDays);

        workingDays.add(Days.FRIDAY);

        EnumSet<Days> weekendDays = EnumSet.complementOf(workingDays);
        System.out.println(weekendDays);

        EnumSet<Fruit> set4 = EnumSet.of(Fruit.Orange);
        System.out.println(set4);

        EnumSet<Days> set2 = EnumSet.allOf(Days.class);
        System.out.println(set2);

        EnumSet<Days> set3 = EnumSet.noneOf(Days.class);
        System.out.println(set3);
        return null;
    }
}
