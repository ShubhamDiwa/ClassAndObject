package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ARRAYList {
    public static void main(String[] args) {
    ArrayList<String> list= new ArrayList<>();
    list.add("Abhisekh");
    list.add("Viranch");
    list.add("Shubham");
    list.add("Devendra");
    list.remove(1);// will remove index one


        System.out.println(list);


        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
