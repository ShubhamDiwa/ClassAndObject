package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class forEachMethod {
    public static void main(String[] args) {
        Stream<String>stream=Stream.of("GFG","hello","Geeks for Geeks");



        stream.sorted(Comparator.reverseOrder()).flatMap(str->Stream.of(str.charAt(1))).forEach(System.out::println);



        // Using forEachOrdered(Consumer action)
        stream.flatMap(str-> Stream.of(str.charAt(2)))
                .forEachOrdered(System.out::println);



    }
}
