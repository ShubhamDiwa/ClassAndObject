package OOPSMisc;

public class recursionEg {
    static int n1 = 0, n2 = 1, n3 = 0;

    static int  fibonacci(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);
           fibonacci(n3);
        }

        return n;
    }



    public static void main(String[] args) {
        int n=15;
        System.out.println(n1+" "+n2);
        fibonacci(n-2);



    }

}
