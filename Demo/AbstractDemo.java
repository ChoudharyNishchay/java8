package Demo;

 abstract class Parent {
     abstract void parentMethod1();

     abstract void parentMethod2();

     public int add(int a, int b) {
         return a + b;
     }
 }

abstract class Child1 extends Parent{

    abstract void child1Method();


}

abstract class Child2 extends Parent{

    abstract void child2Method();
}

   class GrandChild extends Child1{

     @Override
     void child1Method() {
         System.out.println("Inside child1Method");
     }

     @Override
     void parentMethod1() {
         System.out.println("Inside        d1");

     }

     @Override
     void parentMethod2() {
         System.out.println("Inside parentMethod2");
     }
 }


 
public class AbstractDemo {
    public static void main(String[] args) {

        GrandChild grandChild=new GrandChild();

        grandChild.parentMethod1();
        grandChild.parentMethod2();
        grandChild.child1Method();

    }
}





