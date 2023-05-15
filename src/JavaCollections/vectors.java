package JavaCollections;

import java.util.Iterator;
import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        Vector<String>v= new Vector<>();
        v.add("shubham");
        v.add("Abhidekdb");
        v.add("Viranch");
        v.add("dev");

        Iterator<String>itr=v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }

        Vector<Integer> i=new Vector<>();
        i.add(1);
        i.add(2);
        i.add(5);
        i.add(4);
        System.out.println(i.size());
        System.out.print(i);





        ;
        }
//        System.out.println(v);




    }


