public class Animal {
    // this is exmaple of a polymorphism the abovw exmples are of method overloadinng
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
class main {
    public static void main(String[] args) {
        Animal myanimal= new Animal();
        myanimal.animalSound();

        Animal mypig=new Pig();
        mypig.animalSound();


        Animal myDog= new Animal();
        myDog.animalSound();

    }
}
