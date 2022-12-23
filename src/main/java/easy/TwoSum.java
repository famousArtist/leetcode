package easy;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(new TwoSum().twoSum(new int[]{2, 5, 5, 11}, 10));
    }

    // Time: O(n2)
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int desired = target - nums[i];
            if (map.containsKey(desired)) {
                return new int[] { map.get(desired), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

// first solution
//    public int[] twoSum(int[] nums, int target) {
//        int[] indexies = new int[2];
//        List<Integer> numsSortedList = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            numsSortedList.add(nums[i]);
//
//        }
//        Collections.sort(numsSortedList);
//
//        int num1 = 0;
//        int num2 = 0;
//
//
//        for (int i = 0; i < numsSortedList.size()-1; i++) {
//            boolean isTarget = false;
//            num1 = numsSortedList.get(i);
//            for (int j = i+1; j < numsSortedList.size(); j++) {
//                num2 = numsSortedList.get(j);
//                if (num1 + num2 == target ){
//                    isTarget = true;
//                    break;
//
//                } else if ( num1 + num2 > target) {
//                    break;
//                }
//            }
//            if (isTarget){
//                break;
//            }
//
//        }
//        boolean gotFirstIndex = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == num1 && gotFirstIndex == false) {
//                gotFirstIndex = true;
//                indexies[0] = i;
//            } else if (nums[i] == num2){
//                indexies[1] = i;
//
//            }
//
//
//        }
//        return indexies;
//    }
}
