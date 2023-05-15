package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String>st= new HashSet<>();
        st.add("Shubham");
        st.add("Aman");
        st.add("Ashok");

        Iterator<String>itr= st.iterator();
        while (itr.hasNext()){
            System.out.println(" hello world "+itr.next());
        }

        HashSet<String> str= new HashSet<String>();

        //displaying the initial size
        System.out.println("Size at the beginning "+str.size());

        //add elements
        str.add("Hello");
        str.add("Hi");
        str.add("Namaste");
        str.add("Bonjour");

        //displaying the HashSet
        System.out.println(str);
        //displaying the size
        System.out.println("Size after addition "+str.size());

        //remove element using value
        str.remove("Bonjour");

    }
}
