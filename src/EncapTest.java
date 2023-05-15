public class EncapTest {
    private String name ;
    private String idNum;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class RunEncapt{
    public static void main(String[] args) {
        EncapTest encapTest= new EncapTest();
        encapTest.setName(" shubham");
        encapTest.setIdNum("1");
        encapTest.setAge(24);

        System.out.print("Name"+encapTest.getName()+"Id:"+encapTest.getAge()+"Age:"+encapTest.getAge());
    }
}
