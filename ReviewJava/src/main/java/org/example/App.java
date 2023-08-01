package org.example;

//import java.util.HashSet;
import org.example.setInterface.EnumSetExample;
import org.example.setInterface.HashSet;
import org.example.setInterface.LinkedHashSetExample;

import java.util.Set;

public class App
{
    public static void main( String[] args ) {
        HashSet hash = new HashSet();
        hash.hashSet();

        EnumSetExample enumSetExample = new EnumSetExample();
        enumSetExample.enumSet();

        LinkedHashSetExample linkedHashSetExample = new LinkedHashSetExample();
        linkedHashSetExample.linkedHashSetEx();
    }
}
