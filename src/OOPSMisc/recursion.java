package OOPSMisc;

public class recursion {
// recursion eg: factorial of number
    static int factorial(int n){
        if (n==1)
            return 1;
        else
           return(n* factorial(n-1));
    }

    public static void main(String[] args) {
        System.out.println("factorial of no :"  +  factorial(5));
    }
}
