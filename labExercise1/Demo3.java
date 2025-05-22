package labExercise1;
//3) If class does not have main method, how can we execute user defined methods of that class?
class FirstDemo{

    public void method1(){
        System.out.println("Method one");
    }

}


public class Demo3 {
    public static void main(String[] args) {
        FirstDemo f=new FirstDemo();
        f.method1();
    }
}
