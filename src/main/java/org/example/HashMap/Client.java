package org.example.HashMap;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Person p1 = new Person(1, "abc", 10);
        Person p2 = new Person(1, "abc", 10);
        Person p3 = new Person(2, "abc", 15);

        System.out.println(p1.equals(p2));
        System.out.println("p1:" + p1.hashCode() + " , p2:" + p2.hashCode() + " , p3:" + p3.hashCode());

        HashMap<Person, Boolean> hmp = new HashMap<>();
        hmp.put(p1, true);
        hmp.put(p2, true);
        hmp.put(p3, true);

        System.out.println(hmp.size());
    }
}
