package II.Array;

public class CacHamXuLyChuoi {
    public static void main(String[] args) {
        String chuoi1 = "Welcome" ;
        String chuoi2 = " to";
        String chuoi3 = " Java";

        String concatString = chuoi1.concat(chuoi2).concat(chuoi3);
        System.out.println(concatString);

        //Hàm trả về ký tự theo index
        char character = chuoi1.charAt(5);
        System.out.println(character);

        //Hàm so sánh chuối.0 : hai chuỗi giống nhau, < 0 : chuỗi 1 < chuỗi 2 và ngược lại
        int result = chuoi1.compareTo(chuoi2);
        System.out.println(result);
    }
}
