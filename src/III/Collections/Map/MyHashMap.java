package III.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {

        //Chú ý rằng, tôi đã thêm 4 phần tử vào bên trong HashMap, nhưng kích thước của HashMap thì chỉ có một, và khi duyệt nó
        // chỉ in ra phần tử cuối cùng trong 4 phần tử đó. Tại sao?
        //Điều thứ nhất: Bạn hãy chú ý đến các phương thức hashCode() và equals(). Trong đó phương thức hashCode() trong lớp LangKey,
        // nó luôn trả về 5 và equals() luôn trả về true.
        //Khi một giá trị được lưu vào trong HashMap, nó tính toán hash dựa trên đối tượng key và nó sử dụng phương thức hashCode() để
        // làm việc này. Dựa trên hash nhận được, HashMap sẽ quyết định bucket nào dùng để chứa đối tượng Entry mới này.
        //Với hashCode() luôn trả về 5. Điều này có nghĩa là những hash đã được tính toán giống i hệt nhau với những value khác nhau.
        // Cho nên tất cả các đối tượng Entry được lưu vào trong cùng 1 bucket.
        //Điều thứ 2, HashMap sử dụng phương thức equals() để check xem value sẽ được thêm vào có giống với value đã nằm trong nó với
        // trường hợp trùng hash hay không. Như đã nhắc ở trên, (Entry Object) được lưu dưới dạng linked list.
        // Nó giống trường hợp của chúng ta ở hashCode() nhưng lại khác ở equals() vì equals() lúc này trả về false - có nghĩa là có một key
        // chứa nhiều hơn một value. Ở đoạn code trên equals() luôn trả về true cho nên HashMap nghĩ rằng các key này đều giống nhau và bắt đầu ghi đè giá trị cũ.

//        Map<LangKey, String> langMap = new HashMap<LangKey, String>();
//        langMap.put(new LangKey(1, "EN"), "English");
//        langMap.put(new LangKey(2, "VI"), "Vietnamese");
//        langMap.put(new LangKey(3, "ES"), "Spainish");
//        langMap.put(new LangKey(4, "JP"), "Jaspanese");
//
//        System.out.println("Size cua langMap la: " + langMap.size());
//        System.out.print("Cac phan tu cua langMap: ");
//        Iterator<LangKey> itr = langMap.keySet().iterator();
//        while (itr.hasNext()) {
//            System.out.print(langMap.get(itr.next()) + ", ");
//        }
//        System.out.println("\nSize cua langMap la: " + langMap.size());
//
//        System.out.println(langMap.get(new LangKey(1, "EN")));



        Map<LangKeyNotOverrideEquals, String> langMap = new HashMap<LangKeyNotOverrideEquals, String>();
        langMap.put(new LangKeyNotOverrideEquals(1, "EN"), "English");
        langMap.put(new LangKeyNotOverrideEquals(2, "VI"), "Vietnamese");
        langMap.put(new LangKeyNotOverrideEquals(3, "ES"), "Spainish");
        langMap.put(new LangKeyNotOverrideEquals(4, "JP"), "Jaspanese");

        System.out.println("Size cua langMap la: " + langMap.size());
        System.out.print("Cac phan tu cua langMap: ");
        Iterator<LangKeyNotOverrideEquals> itr = langMap.keySet().iterator();
        while (itr.hasNext()) {
            System.out.print(langMap.get(itr.next()) + ", ");
        }
        System.out.println("\nSize cua langMap la: " + langMap.size());

        System.out.println(langMap.get(new LangKeyNotOverrideEquals(1, "EN")));
        System.out.println(langMap.get(new LangKeyNotOverrideEquals(3, "ES")));
        System.out.println(langMap.get(new LangKeyNotOverrideEquals(4, "JP")));



        //Map thường. Khi get ra key ko tồn lại, nó sẽ trả về null
//        HashMap<Integer, String> mapNormal = new HashMap<>();
//        mapNormal.put(2, "Hai");
//        mapNormal.put(6,"Sau");
//        mapNormal.put(1, "Mot");
//
//        System.out.println(mapNormal.get(20));
    }
}
