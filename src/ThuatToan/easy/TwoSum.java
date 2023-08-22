package ThuatToan.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static List<Integer> twoSum(List<Integer> nums, int target) {
        List<Integer> response = new ArrayList<>(2);
        for (int i = 0; i < nums.size(); i++) {
            for (int z = i + 1; z < nums.size(); z++) {
                if (nums.get(i) + nums.get(z) == target) {
                    response.add(i);
                    response.add(z);
                }
            }
        }

        return response;
    }

//    Cách này hay hơn
    public static List<Integer> twoSum2(List<Integer> nums, int target) {
        int n=nums.size();
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> response = new ArrayList<>(2);
        for(int i=0;i<n;i++){
            int key = target - nums.get(i);
            if(map.containsKey(key)){
                response.add(0,map.get(key));
                response.add(1,i);
                return response;
            }
            map.put(nums.get(i),i);
        }
        return response;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,2,4);
//        List<Integer> result = twoSum(nums, 6);
        List<Integer> result = twoSum2(nums, 6);

        for (int element : result) {
            System.out.println(element);
        }
    }
}
