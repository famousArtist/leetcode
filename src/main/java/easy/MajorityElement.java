package easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int number = Integer.MIN_VALUE;
        int value = Integer.MIN_VALUE;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int num: nums){
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
                if(map.get(num) > value){
                    number = num;
                    value = map.get(num);
                }
            } else {
                map.put(num, 1);
            }
        }
        if (value > nums.length/2){
            return number;
        }
        return 0;
    }
}
