package OOPSMisc;

public class CallByValueEg2 {
    int data =50;
    void change(CallByValueEg2 op){
        op.data=data+50;

    }

    public static void main(String[] args) {
        CallByValueEg2 cb= new CallByValueEg2();
        System.out.println(cb.data);

        cb.change(cb);
        System.out.println(cb.data);


    }
}
