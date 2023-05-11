package String;

public class Stringliterals {
  static   String s1="shubham";
  // String literal example
   static String s2="shubham Diwakar";

    public static void main(String[] args) {
        System.out.println(s1);
        System.out.println(s2);

        // creating String using new
        String j= new String("Shubham");
        System.out.println(j);


        //  String  is Immutable Example

        String s="Aman";
        s.concat("Diwakar");

        // s is not concated  bcz String is Immutable
        System.out.println(s);

        // we have assign explicitly to it's reference variable
        String A="Aman";
        A=A.concat("Diwakar");

        System.out.print(A);




    }
}
