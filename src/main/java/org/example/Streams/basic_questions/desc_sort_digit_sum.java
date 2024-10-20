package org.example.Streams.basic_questions;

import org.example.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class desc_sort_digit_sum {

    private static int digitSum(int number) {
        return String.valueOf(number).chars() // Convert number to stream of characters
                .map(Character::getNumericValue) // Convert characters to their numeric value
                .sum(); // Sum up the values
    }

    private static class DigitSumComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            int sumA = digitSum(a);
            int sumB = digitSum(b);
            return Integer.compare(sumB, sumA); // For descending order
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 3, 5, 8, 14, 11, 12, 6);

        List<Integer> sortedList1 = integerList.stream()
                .sorted(new DigitSumComparator())
                .collect(Collectors.toList());

        List<Integer> sortedList2 = integerList.stream().sorted(Comparator.comparingInt(desc_sort_digit_sum::digitSum).reversed()).toList();

        System.out.println(sortedList1);
        System.out.println(sortedList2);
    }
}
