package MultiThreading.threadCreation;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<200;i++){
            System.out.println("Runnable Child Thread");
        }
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<200;i++) {
            System.out.println("Main Thread");
        }
        }

}
