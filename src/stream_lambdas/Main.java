package stream_lambdas;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // A lambda is an anonymous function.
        // instead of writing below
        /**
         * public int square (int x) {
         *      return x*x
         * }
         */
        // we can write
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // Output: 25

        // Stream Api a stream lets you process collections without modifying them.
    }
}
