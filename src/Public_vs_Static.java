public class Public_vs_Static {

    static void helloworld(){
        System.out.println(" HELLO WE ARE CHECKING THE PUBLIC VS STATIC CONCEPT ");
    }

    public void mars(){
        System.out.println(" HELLO WE ARE CHECKING THE PUBLIC VS STATIC CONCEPT this is for public  ");
    }

    public static void main(String[] args) {
        helloworld();
        Public_vs_Static s= new Public_vs_Static();
        s.mars();
    }
}
