package org.example.Streams.basic_questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class sum_of_list {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10,3,5,8,14,11,12,6);

        int sum1 = integerList.stream().
                mapToInt(a -> a.intValue()).
                sum();

        int sum2 = integerList.stream()
                .reduce(0, (curSum, curVal) -> curSum + curVal);

        int sum3 = 0;
        for (int num : integerList) {
            sum3 += num;
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
