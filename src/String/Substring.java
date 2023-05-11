package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
        String s = "hello World";
        System.out.println(s.substring(0, 2));


        String s1 = "SachinTendulkar";
        //  System.out.print(s1.substring(6));


        String text = new String("HelloMynameisSchin");
        // split the string using the split

        String[] sentences = text.split(" \\.");
        System.out.println(Arrays.toString(sentences));

        String str = "alpha+beta+gama+delta+sigma";
        String[] result = str.split("\\+");
        for (String d : result) {
            System.out.println(d);
        }

        System.out.println("_________________________________________________________________________________________________");
        String letters = "alpha, beta, gama, delta, sigma";
        String[] res = letters.split("\\,",3 );
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

            String st = "alpha beta gama delta sigma";
            String[] words = st.split(" ", 0);

            //using java loop to print elements of string array
            for (i = 0; i < words.length; i++) {
                System.out.println(words[i]);

            }
        }
    }
}
