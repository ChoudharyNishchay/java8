package java8;

interface Lambda{
    void test();
}


public class LambdaIntro implements Lambda {







    @Override
    public void test() {
        System.out.println("regular implementation");
    }

    public static void main(String[] args) {
     Lambda lambda=new LambdaIntro();
     lambda.test();

     Lambda lambda1=new Lambda() {
         @Override
         public void test() {
             System.out.println("Anonymous implementation");
         }
     };

     lambda1.test();

     Lambda lambda2= ()->{
         System.out.println("Implementation using Lambda Expression");
     };
lambda2.test();
        }



    }

