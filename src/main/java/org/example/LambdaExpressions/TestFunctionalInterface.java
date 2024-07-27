package org.example.LambdaExpressions;

public class TestFunctionalInterface {

    interface Test1{
        void print();
    }

    interface Test2{
        void print(Integer num);
    }

    interface Test3{
        void print(Integer num1, Integer num3);
    }

    public static void fun1(Test1 t) {
        t.print();
    }

    public static void fun2(Test2 t, Integer num){
        t.print(num);
    }

    public static void fun3(Test3 t, Integer a, Integer b){
        t.print(a, b);
    }

    public static void main(String[] args) {
        fun1(() -> System.out.println("Hello no param functional interface"));

        fun2((num) -> System.out.println("test 2 num: " + num), 11);

        fun3((a, b) -> System.out.println("test 3 nums: " + a + "," + b), 2,3);
    }
}
