package easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            if (numMap.containsKey(num)){
                return true;
            } else {
                numMap.put(num, 1);
            }
        }
        return false;
    }
}
