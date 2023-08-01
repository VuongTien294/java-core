package I.Overview;

public class ToanTu {
    public static void main(String[] args) {
        //B1 : Xử lý Prefix trước (secondVariable)
        //B2 : Xử lý các phép toán còn lại
        //B3 : Gán giá trị cho toán hạng nằm bên trái dấu = trước
        //B4 : Xử lý Postfix (firstVariable)
        int firstVariable = 5, secondVariable = 7;
        int result = firstVariable++ + ++secondVariable - 8;

        System.out.println("First Variable = "+ firstVariable);
        System.out.println("Second Variable = "+ secondVariable);
        System.out.println("Result Variable = "+ result);

        //Dựa vào quy tắc bên trên ta sẽ có cách tính như sau
        //B1 : Xử lý Prefix trước: Chúng ta thấy đoạn chương trình có ++secondVariable là Prefix nên ta xử lý trước
        //=>  ++secondVariable = 7 + 1 = 8
        //B2 : Xử lý các phép toán còn lại : 5 + 8 - 8 = 5
        //B3 : Gắn kết quả cho toán hang bên trái : result = 5
        //B4 : Xử lý Postfix : firstVariable++ => firstVariable++ = 5 + 1 = 6
    }
}
