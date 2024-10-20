package org.example.Streams.basic_questions;

import java.util.Arrays;
import java.util.List;

public class find_any_greater_than_10 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,3,5,8,14,11,12,6);

        Integer val = integerList.stream().filter(num -> num > 10).findAny().orElse(null);
        System.out.println(val);
    }
}
