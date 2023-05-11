public class Calculation {

    // this is the example of inheritance
    int z;

    public void addition(int x, int y){

        z=x+y;
        System.out.println("Addition of two is "+z);
    }


    public  void Substraction(int x,int y){
        z=x-y;
        System.out.println("diffrence of two is "+z);
    }

}

class multiply extends Calculation {
    public void mul(int x,int y){
        z=x*y;

        System.out.println(" product ot the two is "+z);
    }


    public static void main(String[] args) {
        multiply m=new multiply();
        m.addition(5,6);
        m.Substraction(71,1);
        m.mul(2,4);

    }
}
