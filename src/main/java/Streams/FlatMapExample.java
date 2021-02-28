package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String... strings){
        List l1 = Arrays.asList(1,2,3,4,5,6);
        List l2 = Arrays.asList(3,4,5,6,7);
        List l3 = Arrays.asList(7,8,9,10);
        List<List> l4 = Arrays.asList(l1,l2,l3);

        Set<Integer> l5 = (Set<Integer>) l4.stream().flatMap(l -> l.stream()).collect(Collectors.toSet());

        l5.forEach(System.out::println);
    }
}
