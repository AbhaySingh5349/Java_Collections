package org.example.Streams.basic_questions;

import java.util.Arrays;
import java.util.List;

public class avg_of_list {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,3,5,8,14,11,12,6);

        double avg = integerList.stream().
                mapToDouble(a -> a.doubleValue()).
                average().
                getAsDouble();

        System.out.println(avg);
    }
}
