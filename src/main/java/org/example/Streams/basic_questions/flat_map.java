package org.example.Streams.basic_questions;

import java.util.Arrays;
import java.util.List;

public class flat_map {
    public static void main(String[] args) {
        List<List<Integer>> grid = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6));
        List<Integer> flatList = grid.stream().flatMap(arr -> arr.stream()).toList();
        System.out.println(flatList);
    }
}
