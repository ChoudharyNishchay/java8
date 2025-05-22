package labExercise1;
//4) Write a program with same method in different class.
class First{
    public void method(){
        System.out.println("First class method");
    }
}

class Second{
      public void method(){
          System.out.println("Second class method");
      }
}

public class SameMethodCalling {
    public static void main(String[] args) {
         First f=new First();
         Second s=new Second();

         f.method();
         s.method();
    }
}
