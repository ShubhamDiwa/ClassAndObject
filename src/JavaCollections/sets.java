package JavaCollections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) {
        Set<String>st = new TreeSet<>();
        //displaying the initial size
        System.out.println("Size at the beginning "+st.size());

        // Elements are added using add() method
        st.add("India");
        st.add("USA");
        st.add("Britain");

        //displaying the TreeSet
        System.out.println(st);
        st.add("India"); // duplicate value will not be placed in list
        System.out.println(st);// element stored in ascending order


        TreeSet<String>set= new TreeSet<>();
        set.add("Shubham");
        set.add("India ");
        set.add("is my country");

        Iterator<String> itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
