package org.example.Streams.basic_questions;

import java.util.Arrays;
import java.util.List;

public class even_name_greater_than_10 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,3,5,8,14,11,12,6);

        integerList.stream().
                filter((num) -> num%2 == 0).
                filter((num) -> num > 10).
                sorted().
                forEach(System.out::println);
    }
}
