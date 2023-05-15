package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class streamSoerted {
    public static void main(String[] args) {
        //List<Integer>list= Arrays.asList(5,-10,15,11,20);

        List<String> list = Arrays.asList("Geeks", "for",
                "GeeksforGeeks", "GeeksQuiz", "GFG");


        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
