package stream;

import java.util.Arrays;
import java.util.List;

public class sequential {
    public static void main(String[] args) {

        List<String>list= Arrays.asList("g","e","e","k","s","f","o","r","g","e","e","k","s");
        list.stream().forEach(System.out::print);
    }
}
