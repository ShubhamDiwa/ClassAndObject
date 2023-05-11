package String;

public class stringBuffer {
    public static void main(String[] args) {

        // Append

        StringBuffer sb= new StringBuffer(" Hello");
        sb.append("world");
        System.out.println(sb);

        StringBuffer S= new StringBuffer("Shubham");
        S.append("Diwakar");

        System.out.println(S);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                              //Insert

        StringBuffer ST=new StringBuffer("Hello");
        ST.insert(5,"Java");//now original string is changed
        System.out.println(ST);// insert values from start

        System.out.println("_______________________________________________________________________________________________");
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

                                          //String Buffer Delete Method

        // it has to give start and end index

        StringBuffer stringBuffer= new StringBuffer("Bottle");
        stringBuffer.delete(0,2);
        System.out.println(stringBuffer);

        System.out.println("_______________________________________________________________________________________________");
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                           // StringBuffer reverse() Method

        StringBuffer stf= new StringBuffer(" My Name is Shubham");
        stf.reverse();

        System.out.println(stf);

        System.out.println("_______________________________________________________________________________________________");
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                                //StringBuffer capacity() Method

        StringBuffer Sd=new StringBuffer();
        System.out.println(Sd.capacity());//default 16
        Sd.append("Hello world");
        System.out.println(Sd.capacity());// still 16

        Sd.append("Hello my name is Shubham I am java Developer ");
        System.out.println(Sd.capacity());// gives 56



    }
}
