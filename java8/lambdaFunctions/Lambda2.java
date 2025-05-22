package java8;

interface Solution{
    double findCircleArea(int radius);
}
public class Lambda2 {
    public static void main(String[] args) {

        Solution circle=(int r)->{
            return r*r*3.14;
        };


        double result=circle.findCircleArea(10);

        System.out.println("Area of circle is: "+result);

    }
}
