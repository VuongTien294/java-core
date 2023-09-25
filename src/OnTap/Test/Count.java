package OnTap.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Count {


    public static String count(String queuePerson){
        int soW = 0;
        int soC = 0;
        int soM = 0;

        String W = "";
        String C = "";
        String M = "";

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

        Set<String> set = map.keySet();
        for (String key : set) {

        }


        if(soW == soC || soW == soM || soM == soC){
            return M.concat(W).concat(C);
        }
        return W.concat(C).concat(M);

    }

    public static void main(String[] args) {
        System.out.println(count("MMWWCC"));
    }
}
