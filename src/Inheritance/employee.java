package Inheritance;

 class employee {
    float salary=40000;


}
class  employee2 extends employee {
    int bous = 5000;


    public static void main(String[] args) {
       employee2 e= new employee2();

        System.out.println(e.salary+""+e.bous);
    }
}

