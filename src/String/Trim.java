package String;

public class Trim {
    public static void main(String[] args) {
        //String s="  Sachin  ";
        //String s="  Sachin Tendulka ";
        String s="   ";

        double a1 = Double.parseDouble(String.format("%.2f","4.05")); // 8 bytes
        int a2 = 4;
        long a3 = 4;
        float a4 = Float.parseFloat("4.05");
        System.out.println("a1: "+Double.valueOf(a1));
        System.out.println("a4: "+Double.valueOf(a4));
        System.out.println(""+(a1 > a2));
        System.out.println(""+(a2 > a3));
        System.out.println(""+(a3 > a4));
        System.out.println(""+(Double.valueOf(String.format("%.2f","4.05")) > Double.valueOf(String.format("%.2f","4.05"))));
        System.out.println(""+(a4 > a1));



        // trim removes the extra spaces
        System.out.println(s);//  Sachin
        System.out.println(s.trim());//Sachin
        System.out.println(s.trim().length());//Sachin



    }

}
