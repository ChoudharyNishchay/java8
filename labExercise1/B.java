package labExercise1;

public class B {
    public static void main(String[] args) {
        System.out.println("A main");
        m1();
      

    }
    public static void m1() {
        System.out.println("A m1");
        main(new String[0]);
    }
}