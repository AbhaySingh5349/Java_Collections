package org.example.Streams.basic_questions;

import java.util.Arrays;
import java.util.List;

public class string_to_uppercase {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Alice", "Bob", "Charlie");

        strs.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}
