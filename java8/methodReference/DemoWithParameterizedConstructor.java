package java8.methodReference;

interface Creatable{
 Student create(String name,int age,String address);
}

class Student{
    String name;
    int age;
    String address;

    Student(String name,int age,String address ){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

public class DemoWithParameterizedConstructor {
    public static void main(String[] args) {
        Creatable c=Student::new;
        Student student=c.create("Nish",23,"Nanded");
        System.out.println(student);

    }
}
