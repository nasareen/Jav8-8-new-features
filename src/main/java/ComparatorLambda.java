import java.util.Arrays;
import java.util.Comparator;

public class ComparatorLambda {

    public static void main(String... strings) {

        String[] array = {"**","****","*","***"};

        Comparator<String> comp = ( s1,  s2)-> Integer.compare(s1.length(), s2.length());

        Arrays.sort(array,comp);
        Arrays.stream(array).forEach(System.out::println);

        Iterable<String> it;
    }

}
