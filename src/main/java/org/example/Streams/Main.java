package org.example.Streams;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(value -> System.out.println(value));

        int max = Arrays.stream(arr).max().orElseThrow();
        System.out.println("max: " + max);

        int sum = Arrays.stream(arr).sum();
        System.out.println("sum: " + sum);

        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("avg: " + avg);

        int[] array = new int[5];
        System.out.println(array[0]);
    }
}
