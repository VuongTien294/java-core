package III.Collections.Map;

import java.util.Set;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2,"Hai");
        treeMap.put(3,"Ba");
        treeMap.put(1,"Một");
        treeMap.put(9,"Chín");

        Set<Integer> keySet = treeMap.keySet();
        for (Integer key : keySet){
            System.out.println(treeMap.get(key));
        }

    }
}
