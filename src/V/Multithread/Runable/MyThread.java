package V.Multithread.Runable;

public class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Thread.currentThread().getName(): cho chúng ta biết tên luồng đang chạy
            // và tên luồng này có thể thay đổi được.
            System.out.println(Thread.currentThread().getId() + "\t" +
                    Thread.currentThread().getName());
        }
    }
}
