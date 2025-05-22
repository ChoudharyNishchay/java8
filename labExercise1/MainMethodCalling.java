package labExercise1;

public class MainMethodCalling {
    public static void main(String[] args) {
        System.out.println("First main method");
        SecondClass.main(new String[0]);

    }
}

class SecondClass{
    public static void main(String[] args) {
        System.out.println("Second main method");
    }
}
