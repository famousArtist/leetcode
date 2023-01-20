package leetcode.easy.strings

class LongestPollindrome {

    fun longestPalindrome(s: String): Int {

        var result = 0;
        var map = hashMapOf<Char, Int>()


        var charArray = s.toCharArray()

        for (c in charArray){
            if (map.containsKey(c)){
                result += 2
                map.remove(c)
            } else {
                map[c] = 1
            }
        }
        if (map.size > 0){
            result +=1
        }
        return result
    }
    
    //best leetcode solution
//    class Solution {
//        fun longestPalindrome(s: String): Int {
//            return minOf(
//                s.length,
//                1 + s
//                    .groupingBy { it }
//                    .eachCount()
//                    .map { (k, v) -> v / 2 * 2 }
//                    .sum()
//            )
//        }
//    }
}

