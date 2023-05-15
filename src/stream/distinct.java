package stream;

import java.util.Arrays;
import java.util.List;

public class distinct {
    public static void main(String[] args) {
        // Creating a list of integers
      //  List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

        // Displaying the distinct elements in the list
        // using Stream.distinct() method
       // list.stream().distinct().forEach(System.out::println);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Creating a list of strings
        List<String> list = Arrays.asList("Geeks", "for", "Geeks",
                "GeeksQuiz", "for", "GeeksforGeeks");

        // Storing the count of distinct elements
        // in the list using Stream.distinct() method
        long Count = list.stream().distinct().count();

        // Displaying the count of distinct elements
        System.out.println("The count of distinct elements is : " + Count);

    }

}
