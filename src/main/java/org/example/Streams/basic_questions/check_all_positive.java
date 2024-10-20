package org.example.Streams.basic_questions;

import java.util.Arrays;
import java.util.List;

public class check_all_positive {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, -1, 3, -5, 6);
        boolean arePositive = integerList.stream().allMatch(num -> num > 0);
        System.out.println(arePositive);
    }
}
