package org.example.Streams.basic_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class list_to_set {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(8,5,5,8,10,11,12,6));
        Set<Integer> st = integerList.stream().collect(Collectors.toSet());
        System.out.println(st);
    }
}
