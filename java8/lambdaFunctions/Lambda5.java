package java8;


import org.w3c.dom.ls.LSOutput;

public class Lambda5 {
    public static void main(String[] args) {
         Runnable runnable=()->{
             System.out.println("Runnable is called");
         };
         runnable.run();
    }
}
