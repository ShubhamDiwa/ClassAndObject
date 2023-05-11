package String;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Javatpoint";
        String str3 = "Reader";

        // concating single string
        String s4=str1.concat(str2);

        // concating multiple String
        String s5=str1.concat(str2).concat(str3);

        System.out.println(s4);
        System.out.println(s5);

        // Concatenating or adding  Space among strings
        String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println(str4);


        // Concatenating Special Chars
        String str5 = str1.concat("!!!");
        System.out.println(str5);

        // adding @ in between
        String str6 = str1.concat("@").concat(str2);
        System.out.println(str6);


        String str = "Country";
      // we have added the string "India is my" before the String str;
      // Also, observe that a string literal can also invoke the concat() method
        String s = "India is my ".concat(str);
      // displaying the string
        System.out.println(s);




    }
}
