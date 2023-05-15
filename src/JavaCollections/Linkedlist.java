package JavaCollections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        System.out.println(list.size());// list will give the value 0
        list.add("shubham");
        list.add("abhisekh");
        list.add("Viru");
        list.add("Dev");
        list.addFirst("C#");
        list.addLast("Kotlin");

        list.add(2,"Pyhton");

        System.out.println(list);
        System.out.println(list.size()); // list will give the size of list
    }
}
