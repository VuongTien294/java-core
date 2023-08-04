package V.Multithread.Synchronized;

public class Customer {
    private int taiKhoan = 10000;

    public Customer(){
        System.out.println("Tài khoản hiện có = " +taiKhoan);
    }

    protected synchronized void rutTien(int soTienRut){
        System.out.println("Giao dịch rút tiền đang được thực hiện với" +
                " số tiền = " + soTienRut + "...");

        if(soTienRut > taiKhoan){
            System.out.println("Số tiền trong tài khoản không đủ");
            try{
                wait(); // phương thức wail sẽ đưa Thread rơi vào trạng thái sleeping
            }catch (InterruptedException ie){
                System.out.println(ie.toString());
            }

            taiKhoan = taiKhoan - soTienRut;
            System.out.println("Rút thành công.Số tiền trong tài khoản là :"+ taiKhoan);
        }
    }

    protected synchronized void nopTien(int soTienNop) {
        System.out.println("Giao dịch nộp tiền đang được thực hiện với" +
                " số tiền nộp = " + soTienNop + "...");
        taiKhoan += soTienNop;
        System.out.println("Nộp tiền thành công. Số tiền hiện có trong tài khoản = " + taiKhoan);
        notify();
    }

}
