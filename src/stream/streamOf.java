package stream;

import java.util.stream.Stream;

public class streamOf {
    public static void main(String[] args) {

        Stream str =Stream.of("Geeks ");
        str.forEach(System.out::println);

        Stream stream = Stream.of("Geeks", "for", "Geeks");
        stream.forEach(System.out::println);

    }


}
