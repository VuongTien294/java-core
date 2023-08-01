package I.Overview;

public class CacKieuDuLieu {
    public static void main(String[] args) {
        int height = 6;
        double mas = 220.23456;

        //Ép ko tường minh từ giá trị nhỏ lên giá trị lớn
        double result = height;
        System.out.println("Giá trị sau khi ép kiểu không tường minh :"+ result);

        //Ép tường minh từ giá trị lớn về giá trị nhỏ
        int massVal = (int) mas;
        System.out.println("Giá trị sau khi ép kiểu tường minh :"+ massVal);
    }
}
