package org.example.Streams.basic_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class count_elements_gtr_than_5 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,3,5,8,14,11,12,6);

        int len = (int) integerList.stream().filter(num -> num > 5).count();
        System.out.println(len);
    }
}
