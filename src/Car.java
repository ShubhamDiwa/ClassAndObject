abstract class Car {

    // abstract method( do not have body )
    public abstract void   carSound();
    // rwgular method
    public void Sleep(){
        System.out.print(" Zzz");
    }
    static class BMW extends Car{
        @Override
        public void carSound() {
            System.out.print(" po...po!!");
        }
    }

}

class vain{
    public static void main(String[] args) {
        Car.BMW bmw=new Car.BMW();
        bmw.carSound();
        bmw.Sleep();

    }

}
