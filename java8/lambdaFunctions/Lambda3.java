package java8;

interface Testlable{
    void test();
}

public class Lambda3 {
    public static void main(String[] args) {
        Testlable testlable=()->{
            System.out.println("We are testing with Lambda expressions");
        };
        testlable.test();
    }
}
