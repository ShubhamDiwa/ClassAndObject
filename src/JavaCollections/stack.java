package JavaCollections;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String>st=new Stack<>();
        st.push("Shubham");
        st.push("Abhisekh");
        st.push("Lucky");
        st.push("ramadheer");
        st.push("realme");
        st.push("vasy");
        st.pop();



        //display the new size
        System.out.println("Size after removal "+st.size());

        //peek method to find the top-most element and display it
        System.out.println("Top-most element " + st.peek());

        Iterator<String>it= st.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
