package JavaCollections;

import java.util.HashMap;

public class hasHMap {
    public static void main(String[] args) {
        // creating a hashmap

        HashMap<Integer,Double>hm= new HashMap<Integer,Double>();
        hm.put(1,1.3);
        hm.put(2,2.3);
        hm.put(3,3.5);
        // Finding the value for a key using get()
        System.out.println(hm.get(2));
    }
}
