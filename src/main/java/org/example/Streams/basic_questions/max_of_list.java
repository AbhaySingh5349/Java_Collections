package org.example.Streams.basic_questions;

import java.util.Arrays;
import java.util.List;

public class max_of_list {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,3,5,8,14,11,12,6);

        int max1 = integerList.stream().
                mapToInt(a -> a.intValue()).
                max().
                getAsInt();

        int max2 = integerList.stream().reduce(Integer.MIN_VALUE, (curMax, curVal) -> Math.max(curMax, curVal));

        int max3 = integerList.stream()
                .max((a, b) -> a.compareTo(b))
                .get();

        int max4 = Integer.MIN_VALUE;
        for (int num : integerList) {
            max4 = Math.max(max4, num);
        }

        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        System.out.println(max4);
    }
}
