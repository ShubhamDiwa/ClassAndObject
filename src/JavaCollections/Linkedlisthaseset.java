package JavaCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedlisthaseset {
    public static void main(String[] args) {
        LinkedHashSet<String>str= new LinkedHashSet<>();
        //add elements
        str.add("Hello");
        str.add("Hi");
        str.add("Namaste");
        str.add("Bonjour");

        //displaying the LinkedHashSet
        System.out.println(str);


        //remove element using value
        str.remove("Bonjour");
        System.out.println(str);
        System.out.println(str.size());

        Iterator<String>itr= str.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
