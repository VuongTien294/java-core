package V.Multithread.SleepJoin;

public class JoinJava extends Thread{
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName() + " đang chạy.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Kết thúc " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        JoinJava thread1 = new JoinJava();
        thread1.setName("Thread 1");
        JoinJava thread2 = new JoinJava();
        thread2.setName("Thread 2");
        JoinJava thread3 = new JoinJava();
        thread3.setName("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
