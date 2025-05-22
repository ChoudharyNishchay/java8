package java8;

interface LambdaInterface{
    int add(int a,int b);
}

public class LambdaWithParameter {
    public static void main(String[] args) {

        LambdaInterface lambdaInterface= (int aa,int bb) ->{

            return aa + bb;
        };

        int result=lambdaInterface.add(10,45);

        System.out.println(result);

        //Anonymous Implementation :-
//        LambdaInterface lambdaInterface1= new LambdaInterface() {
//            @Override
//            public int add(int a, int b) {
//                return a+b ;
//            }
//        };
//        int result2=lambdaInterface1.add(1,43);
//        System.out.println(result2);

    }
}
