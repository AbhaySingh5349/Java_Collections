package org.example.LambdaExpressions;

import java.util.function.Predicate;

public class PredicateEven implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer%2 == 0;
    }
}
