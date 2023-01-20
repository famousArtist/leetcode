package easy.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int first = newInterval[0];
        int second = newInterval[1];

        Map<Integer, Integer> map = new HashMap<>();


//        for (int k : map.keySet()){
//            if (k > first){
//
//            }
//        }

//        for (int i = 0; i < intervals.length - 1; i++){
//            int[] currentInterval = intervals[i];
//            int[] nextInterval = intervals[i+1];
//            if (first > currentInterval[0] && first < nextInterval[0]){
//                if (first > currentInterval[1]){
//                    currentInterval[1] = first;
//                }
//            }
//            
//            if ( second > currentInterval[1] && second < nextInterval[1]){
//                
//            }
//        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            boolean hasStart = false;
            boolean hasFinish = false;
            int[] currentInterval = intervals[i];
            int[] nextInterval = intervals[i + 1];
            if (first < currentInterval[0] && !hasStart) {
                hasStart = true;
                currentInterval[0] = first;
            }
//            for (int j = 0;  j < currentInterval.length; j++){
//                if (!hasStart && first < currentInterval[j]){
//                    currentInterval[j]
//                } else if (hasStart && !hasFinish && second > )
//            }


        }
        return null;
    }
}
