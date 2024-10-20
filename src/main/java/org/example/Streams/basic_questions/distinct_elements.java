package org.example.Streams.basic_questions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class distinct_elements {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(8,5,5,8,10,11,12,6));

        List<Integer> distinctList = integerList.stream().distinct().toList();
        System.out.println(distinctList);
    }
}
