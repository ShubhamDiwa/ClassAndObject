package Arrays;

public class finding_the_minimum_Array {

     static void min(int a[]) {
         int min = a[0];
         for (int i = 1; i < a.length; i++) {
             if (min > a[i])
                 min = a[i];


         }
         System.out.println(min);

     }

    public static void main(String args[]) {
        int a[]={33,4,5,1};
        min(a);


    }

}
