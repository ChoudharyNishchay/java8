package MultiThreading.synchronization;

class Display{

    public synchronized void wish(String name) {

        for(int i=0;i<5;i++){
            System.out.print("Good morning : ");
            System.out.println(name);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("I got interrupted");
            }

         }
    }
}

class MyThread1 extends Thread {
    Display d;
    String name;

    MyThread1(Display d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class SynchronizedMethodDemo {
    public static void main(String[] args) {

        Display d=new Display();
        MyThread1 t1=new MyThread1(d,"Nishhay");
        MyThread1 t2=new MyThread1(d,"Dhoni");
        MyThread1 t3=new MyThread1(d,"Yuvraj");
        MyThread1 t4=new MyThread1(d,"ANUJ");



        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
