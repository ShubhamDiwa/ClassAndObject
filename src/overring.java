public class overring {

        public  void move(){
            System.out.println(" Animals can  move ");



    }
    static class Dog extends overring{
        public void  move(){
            System.out.println(" Dogs can walk and bark");
        }

    }

}
class TestDog{
    public static void main(String[] args) {

        overring ovr1= new overring();
        ovr1.move();
        overring ovr2= new overring.Dog();
        ovr2.move();

    }
}