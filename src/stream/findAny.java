package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class findAny {
    public static void main(String[] args) {
        // creating a list
        List<Integer>list= Arrays.asList(1,2,4,6,8,10);
     //   Optional<Integer> answer=list.stream().findAny();
//        if (answer.isPresent()){
//            System.out.println(answer.get());
//        }else {
//            System.out.println(" no value ");
//        }


        IntStream stream=IntStream.of(4,5,8,16,20,25).parallel();
        stream=stream.filter(i-> i%4==0);
        OptionalInt answer = stream.findAny();
        if (answer.isPresent())
        {
            System.out.println(answer.getAsInt());
        }

    }
}
