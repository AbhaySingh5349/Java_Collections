package org.example.Streams.basic_questions;

import java.util.Arrays;

public class string_stream {
    public static void main(String[] args) {
        String arr[] = {"aec", "cde", "acd", "abc", "xyz"};

        Arrays.stream(arr).
                filter(x -> x.startsWith("a")).
                filter(x -> x.toString().endsWith("c")).
                sorted().
                forEach(System.out::println);
    }
}
