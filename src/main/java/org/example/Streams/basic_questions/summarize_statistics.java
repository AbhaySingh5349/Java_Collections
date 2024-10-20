package org.example.Streams.basic_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class summarize_statistics {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,3,5,8,14,11,12,6);
        IntSummaryStatistics statistics = integerList.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(statistics);
    }
}
