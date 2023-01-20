package easy.strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestPollindrome {


//    public static void main(String[] args) {
//        System.out.println(new LongestPollindrome().longestPalindrome("abccccdd"));
//    }

        public int longestPalindrome(String s) {

            char[]  sArr = s.toCharArray();

            int result = 0;

            StringBuilder sb = new StringBuilder(s);
            HashMap<Character, Integer> map = new HashMap<>();


            for (int i = 0; i < sArr.length; i++) {
                char c = sArr[i];
                if (map.containsKey(c)){
                    result += 2;
                    map.remove(c);
                } else {
                    map.put(c, 1);
                }

            }

            if (map.size() > 0){
                result += 1;
            }

            return result;
        }
}
