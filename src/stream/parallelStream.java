package stream;

import java.util.Arrays;
import java.util.List;

public class parallelStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");

        // using parallelStream()
        // method for parallel stream
       // list.parallelStream().forEach(System.out::print);
        list.parallelStream().forEachOrdered(System.out::print);
    }
}
