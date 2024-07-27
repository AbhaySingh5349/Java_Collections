package org.example.LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Client {

    public static void checkEven(Collection<Integer> integerCollection, Predicate<Integer> predicate){
        integerCollection.forEach((num) -> {
            if(predicate.test(num)){
                System.out.println(num + " is even");
            }else{
                System.out.println(num + " is odd");
            }
        });
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(10, 5, 3, 1, 2));

        PredicateEven predicateEvenUsingClass = new PredicateEven();

        Predicate<Integer> predicateEvenUsingAnonymousClass = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2 == 0;
            }
        };

        // Lambda Expression becomes implementation for only abstract method in our "functional interface"
        checkEven(integerList, x -> x%2==0);
    }
}
