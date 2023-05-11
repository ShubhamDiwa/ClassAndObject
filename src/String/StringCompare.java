package String;

public class StringCompare {
    public static void main(String[] args) {
        String s="shubham";
        String s1="abhisekh";
        String s2="shubham";
        String s3="Shubham";

        // by using equals
        System.out.println(s.equals(s1));// false
        System.out.println(s.equals(s2));// true
        System.out.println(s.equals(s3));// false


System.out.println("___________________________________________________________________________");

        // String comparable using == to

        System.out.println(s==s1);
        System.out.println(s==s);
        System.out.println(s2==s3);
        System.out.println(s==s3);

        System.out.println("___________________________________________________________________________");

        // String Comparison using compareTo

        String S1="Sachin";
        String S2="Sachin";
        String S3="Ratan";
        String S4="Shubham";
        String S5="shubham";
        String S6="SHUBHAM";


        System.out.println(S1.compareTo(S1));
        System.out.println(S1.compareTo(S2));
        System.out.println(S3.compareTo(S3));
        System.out.println(s.compareTo(S4));
        System.out.println(s.compareTo(S5));
        System.out.println(S5.compareTo(S6));
        System.out.println(S2.compareTo(S3));
        System.out.println(S2.compareTo(S4));
    }
}
