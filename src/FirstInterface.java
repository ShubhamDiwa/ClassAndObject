 interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();

}

class DemoClass implements FirstInterface,SecondInterface{



    @Override
    public void myOtherMethod() {

        System.out.print(" My first Method");

    }

    @Override
    public void myMethod() {
        System.out.print(" My second Method ");

    }
}


class Demo{
    public static void main(String[] args) {
        DemoClass myobj= new DemoClass();
        myobj.myMethod();
        myobj.myOtherMethod();
    }

}

