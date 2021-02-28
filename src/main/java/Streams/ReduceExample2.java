package Streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceExample2 {

    public static void main(String... args){
        List<Person> list = new ArrayList<>();

                try(
                    BufferedReader reader = new BufferedReader(
                                new InputStreamReader(
                                        ReduceExample.class.getResourceAsStream("person.txt")));
                    Stream<String> lines = reader.lines();
                    ){

                    System.out.println(lines.toArray().length);
                    lines.map(line -> {
                        String[] s = line.split(" ");
                        Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
                        list.add(p);
                        return  p; }).forEach(System.out::println);

                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
    }
}
