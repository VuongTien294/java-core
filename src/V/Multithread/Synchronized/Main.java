package V.Multithread.Synchronized;

public class Main {
    public static void main(String[] args) {
        final Customer customer = new Customer();

        Thread t1 = new Thread(){

            public void run() {
                customer.rutTien(20000);
            }

        };

        t1.start();

        Thread t2 = new Thread(){

            public void run() {
                customer.nopTien(30000);
            }
        };

        t2.start();
    }
}
