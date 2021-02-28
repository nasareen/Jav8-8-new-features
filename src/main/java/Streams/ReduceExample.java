package Streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceExample {

    public static void main(String... strings){
        int sum = IntStream.range(1, 10).reduce(0, Integer::sum);
        OptionalInt max = IntStream.range(10,100).reduce(Integer::max);

        System.out.println(" sum "+sum);
        System.out.println("Max "+max);
    }
}
