package java8;

interface FunctionalInterface{
    public int cube(int number) ;

     default void test(){
         System.out.println("we are testing");
    }
    static void staticTesting(){
        System.out.println("currently runnning static void");
    }
}

public class LambdawithAll {


    public static void main(String[] args) {

        FunctionalInterface functionalInterface=(int n)->{

            return n*n*n;
        };

        functionalInterface.test();

        FunctionalInterface.staticTesting();


            int result=functionalInterface.cube(12);

        System.out.println("Cube is: "+result);

    }
}
