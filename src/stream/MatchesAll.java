package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MatchesAll {
    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(3, 4, 6, 12, 9,20);
//
//        boolean answer=list.stream().allMatch(n-> n%3==0);
//        System.out.println(answer);
//
       Stream<String> stream = Stream.of("GEEKS", "FOR",
              "GeeksQuiz", "GeeksforGeeks");

        // Check if all elements of stream
        // have length greater than 2 using
        // Stream allMatch(Predicate predicate)
       // boolean answer = stream.allMatch(str -> str.length() > 14);

        boolean answer = stream.allMatch(str-> Character
                .isUpperCase(str.charAt(1)));

        // Displaying the result
        System.out.println(answer);

    }
}
