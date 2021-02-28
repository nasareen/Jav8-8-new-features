import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Lambda1 {
    public static void main(String... strings){
        System.out.println("First Lambda!");

        File path = new File("/Users/nasareen/Desktop/");

        FileFilter filter = (p) -> p.getName().endsWith("java");

        File[] files = path.listFiles(filter);

        Arrays.stream(files).forEach(System.out::println);
    }
}
