package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamFilter {
    public static void main(String[] args) {

        // creating a list
        List<Integer> list= Arrays.asList(3,4,8,10,20,15);
          // Getting a stream consisting of the
              // elements that are divisible by 5
              // Using Stream filter(Predicate -> predicate)

        list.stream().filter(num->num%5==0).forEach(System.out::println);


        Stream<String> stream = Stream.of(
                "Geeks", "for", "GEEKSQUIZ", "GeeksforGeeks");

      //  stream.filter(str->Character.isUpperCase(str.charAt(0))).forEach(System.out::println);// it will print the  UpperCase

        stream.filter(str-> str.endsWith("s")).forEach(System.out::println);





    }
}
