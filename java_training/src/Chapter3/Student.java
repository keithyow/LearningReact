package Chapter3;

// One class can implement more than one interface
public class Student implements People{
    public String getName(){
        return "John Doe";
    }

    public int getAge(){
        return 40;
    }

    public static void main(String[] args) {
        Student stu = new Student();
        System.out.printf("Name = %s Age = %d", stu.getName(), stu.getAge());
    }

}
