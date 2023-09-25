package OnTap.Test.ThuTuKhoiTao.parent;

public class Main {
    public static void main(String[] args) {
        System.out.print("8");
        Child over = new Child();
        System.out.print("1");
    }
}

//Bởi vì ngôn ngữ lập trình Java có thể chạy đa luồng (multithreaded) nên việc khởi tạo các giá trị cần phải được đồng bộ ( có trình tự) một cách chính xác.
//Trong câu hỏi trên trình tự thực hiện các lệnh sẽ là
//
//1a - Biến tĩnh (Field static) của SubClass ( lớp cha) // 3
//1b - Phần block code của SubClass // 8
//2a - Phần block code của SupClass ( lớp con ) // 4
//2b - Biến tĩnh (Field static) của SupClass // 9
//3 - Các lệnh trong hàm main() trước khi khai báo đối tượng // 8
//4 - Các biến non-static của SubClass // 4
//5 - Hàm khởi tạo ( contrustor) của SubClass // 3
//6 - Các biến non-static của SupClass // 0
//7 - Hàm khởi tạo ( contrustor) của SupClass // 3
//8 - Phần còn lại của main (..)
//
//Và kết quả cuối cùng là : 3849843031
