package java8;

interface Person{
    void name(String s1);
}

public class Lambda7 {
    public static void main(String[] args) {
        Person person=(String n)->{
            System.out.println("Hello "+n);
        };
        person.name("Krish");
    }
}
