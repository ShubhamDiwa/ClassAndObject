package JavaCollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        //displaying the initial size
        System.out.println("Size at the beginning "+pq.size());

        // Adding elements using add()
        pq.add(99);
        pq.add(18);
        pq.add(27);
        pq.add(34);
        System.out.println("head:"+pq.element());

        System.out.println(pq);
// Printing the top element of the PriorityQueue
        System.out.println("head:"+pq.peek());
        //Printing the top element and removing it
        System.out.println(pq.poll());
        // Printing the size the of queue
        System.out.println(pq.size());

        Iterator<Integer> itr=pq.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
