package OOPSMisc;

public class Student12 implements Cloneable{

    // java cloneable Examples
    int roll_no;
    String name ;

    public Student12(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student12 s = new Student12(10, " Shubham");

            Student12 s1 = (Student12) s.clone();


            System.out.println(s.roll_no + " " + s.name +" ");
            System.out.println(s1.roll_no + "  " + s1.name+" ");


        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}
