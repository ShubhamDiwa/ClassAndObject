package String;

public class Contains {
    public static void main(String[] args) {
        String name="what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));

// contains method is case-sensitive
        String Sname="what do you know about me";
        System.out.println(Sname.contains("Do you know"));//  false


        String str = "To learn Java visit Javatpoint.com";
        if (str.contains("visit Javatpoint"))
            System.out.println("contains the java point ");
        else {
            System.out.print(" result not found ");
        }




    }

}
