package JavaCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeques {
    public static void main(String[] args) {
        Deque<String >dq= new ArrayDeque<>();
        dq.add("Abhisekj");
        dq.add("Shuhham");
        dq.add("raman");
        dq.add("vohra");

        System.out.println(dq);

        for (String str:dq){
            System.out.println(str);
        }
    }
}
