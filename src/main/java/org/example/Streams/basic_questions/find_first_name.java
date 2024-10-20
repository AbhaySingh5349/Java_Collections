package org.example.Streams.basic_questions;

import java.util.Arrays;
import java.util.List;

public class find_first_name {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhay Singh", "Shivangi Singh", "Kushagra Prakash");
        names.stream().map(name -> name.split(" ")[0]).forEach(System.out::println);
    }
}
