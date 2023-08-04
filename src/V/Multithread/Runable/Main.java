package V.Multithread.Runable;

public class Main {
    public static void main(String[] args) {
        MyThread myThread0 = new MyThread();
        Thread thread0 = new Thread(myThread0);
        thread0.start();

        MyThread demoThread1 = new MyThread();
        Thread thread1 = new Thread(demoThread1);
        thread1.setName("Luồng 1");
        thread1.start();

        MyThread demoThread2 = new MyThread();
        Thread thread2 = new Thread(demoThread2);
        thread2.start();
    }
}
