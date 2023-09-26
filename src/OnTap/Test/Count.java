package OnTap.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Count {
    public static void count(String queuePerson){
        int soW = 0;
        int soC = 0;
        int soM = 0;

        String W = "";
        String C = "";
        String M = "";

        String result = "";

        for(Character c : queuePerson.toCharArray()){
            if(c.equals('W')){
                soW++;
            }
            if(c.equals('C')){
                soC++;
            }
            if(c.equals('M')){
                soM++;
            }
            if(soW > 0){
                W = soW + "W";
            }
            if(soC > 0){
                C = soC + "C";
            }
            if(soM > 0){
                M = soM + "M";
            }
        }

        Map<String , Integer> map = new HashMap<>();
        map.put(W, soW);
        map.put(C, soC);
        map.put(M, soM);

        List<Map.Entry<String, Integer>> list1 = new ArrayList<>(map.entrySet());

        // Create a comparator to sort by value
        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };

        // Sorting a List
        Collections.sort(list1, valueComparator);

        // Convert List to Map
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list1) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        Set<String> set = sortedMap.keySet();
        for (String key : set) {
            result = result.concat(key);
        }

        if(soW == soM || soW == soC || soM == soC){
            System.out.println(M.concat(W).concat(C));
        }else {
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        count("MMMWWWCCCCC");
    }
}
