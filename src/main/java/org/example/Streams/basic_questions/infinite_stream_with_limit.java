package org.example.Streams.basic_questions;

import java.util.stream.Stream;

public class infinite_stream_with_limit {
    public static void main(String[] args) {
        Stream.
                iterate(1, x -> x+1).
                filter(x -> x.toString().contains("5")).
                limit(10).
                forEach(System.out::println);
    }
}
