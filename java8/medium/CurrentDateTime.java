package java8.medium;

public class CurrentDateTime {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
        Thread.sleep(1000);
        System.out.println(java.time.LocalDateTime.now());

    }
}
