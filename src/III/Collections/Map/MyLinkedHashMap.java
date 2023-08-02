package III.Collections.Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, "A");
        linkedHashMap.put(1, "B");
        linkedHashMap.put(10, "C");

        Set<Integer>  keySet = linkedHashMap.keySet();
        for (Integer key : keySet){
            System.out.println(linkedHashMap.get(key));
        }
    }
}
