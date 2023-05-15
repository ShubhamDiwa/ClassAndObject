public class This {
    // this is used as a reference variable which refers to current class instance

}
class Student{
    String name;
    int rollno;
    int fee ;
    void Students(String name, int rollno, int fee) {
        rollno=rollno;
        name=name;
        fee=fee;

    }
    void display(){
        System.out.println(rollno+" "+fee+" "+name);
    }

    public static void main(String[] args) {
        Student s= new Student();
        s.name=" Shubhak";
        s.fee=2000;
        s.rollno=50;

        s.display();
  }




}
