package org.example.LambdaExpressions;

import java.util.*;

public class SortingClient {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(4, 5, 3, 1, 2));

        class CustomComparator implements Comparator<Integer>{

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 <= o2 ? -1:1;
            }
        }

        CustomComparator customComparatorClass = new CustomComparator();

        Comparator<Integer> comparatorAnonymousClass = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 <= o2 ? -1:1;
            }
        };

        // Lambda expression for sorting
        Collections.sort(integerList, ((o1, o2) -> {return o1 <= o2 ? -1:1;}));

        System.out.println(integerList);
    }
}
