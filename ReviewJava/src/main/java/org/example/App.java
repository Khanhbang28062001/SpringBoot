package org.example;

//import java.util.HashSet;
import org.example.setInterface.EnumSetExample;
import org.example.setInterface.HashSet;

import java.util.Set;

public class App
{
    public static void main( String[] args ) {
        HashSet hash = new HashSet();
        EnumSetExample enumSetExample = new EnumSetExample();

        System.out.println(hash.hashSet());
        System.out.println(enumSetExample.enumSet());

    }
}
