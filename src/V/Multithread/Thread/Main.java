package V.Multithread.Thread;

public class Main {
    public static void main(String[] args) {
        // Tạo ra luồng myThread0 từ lớp MyThread
        MyThread myThread0 = new MyThread();
        myThread0.start();  // kích hoạt luồng

        // Tạo ra luồng myThread1 từ lớp MyThread
        MyThread myThread1 = new MyThread();
        myThread1.start();

        // Tạo ra luồng myThread2 từ lớp MyThread
        MyThread myThread2 = new MyThread();
        myThread2.setName("Luồng 2");   // thay đổi tên luồng thành Luồng 2
        myThread2.start();

        MyThread myThread3 = new MyThread();
        myThread3.setName("Luồng 3");   // thay đổi tên luồng thành Luồng 2
        myThread3.run();

        //Mỗi thread start trong một call stack riêng biệt.
        //Việc gọi phương thức run() từ luồng chính, phương thức run() được xếp vào call stack chứ không phải khởi tạo một call stack mới.

    }
}
