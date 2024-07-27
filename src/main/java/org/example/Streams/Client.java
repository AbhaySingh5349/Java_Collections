package org.example.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(10,3,5,8,14,11,12,6));

        integerList.stream().
                            filter((num) -> num%2 == 0).
                            filter((num) -> num > 10).
                            sorted().
                            forEach(System.out::println);

        int sum = integerList.stream().
                                        mapToInt(Integer::intValue).
                                        sum();

        int max = integerList.stream().
                                        mapToInt(Integer::intValue).
                                        max().
                                        getAsInt();

        double avg = integerList.stream().
                                            mapToInt(Integer::intValue).
                                            average().
                                            getAsDouble();

        Stream.
                iterate(1, x -> x+1).
                filter(x -> x.toString().contains("5")).
                limit(10).
                forEach(System.out::println);

        String arr[] = {"aec", "cde", "acd", "abc", "xyz"};

        Arrays.stream(arr).
                            filter(x -> x.startsWith("a")).
                            filter(x -> x.toString().endsWith("c")).
                            sorted().
                            forEach(System.out::println);

        Student student_arr[] = {new Student(1, "abhay", 70),
                                new Student(2, "shivangi", 80),
                                new Student(3, "ashish", 80)};

        Map<Integer, String> reference_method_mp = Arrays.stream(student_arr).
                collect(Collectors.toMap(Student::getId, Student::getName));

        // Using Collectors.toMap with lambda expressions
        Map<Integer, String> lambda_exp_mp = Arrays.stream(student_arr).
                collect(Collectors.toMap(student -> student.getId(), student -> student.getName()));

        lambda_exp_mp.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));

        // Grouping by marks
        Map<Integer, List<Student>> listMap = Arrays.stream(student_arr).
                collect(Collectors.groupingBy(student -> student.getMarks()));

        listMap.forEach((marks, students) -> {
            System.out.println("Marks: " + marks);
            students.forEach(student -> System.out.println("  " + student));
        });
    }
}
