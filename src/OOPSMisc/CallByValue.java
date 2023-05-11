package OOPSMisc;

public class CallByValue {
    int data =50;
    void  changed(int data){
        data= data+ 50;


    }

    public static void main(String[] args) {
        CallByValue callByValue= new CallByValue();
        callByValue.changed(500);

        System.out.println(callByValue.data +" this is value before change ");

        System.out.println(callByValue.data +"value after change  ");

    }
}
