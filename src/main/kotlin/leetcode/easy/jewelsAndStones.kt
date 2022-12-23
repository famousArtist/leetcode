package leetcode.easy

class jewelsAndStones {
}

class Solution {

}

fun main() {
    println(numJewelsInStones("aA", "aAAbbbb"))

}

//my first solution
//fun numJewelsInStones(jewels: String, stones: String): Int {
//    var count: Int = 0;
//    for (jewel in jewels) {
//        for (stone in stones) {
//            if (stone == jewel) {
//                count++
//
//            }
//        }
//    }
//    return count;
//}

// oneline solution from leetcode
//fun numJewelsInStones(jewels: String, stones: String): Int = stones.count { jewels.contains(it) }

//solution with map and sugar
//fun numJewelsInStones(jewels: String, stones: String): Int {
//    var count: Int = 0
//    var m = jewels.toList().map { it to true }.toMap()
//
//    for (stone in stones) {
//        if (m.get(stone) == true) {
//            count++
//        }
//    }
//    return count;
//}

// solution without sugar
fun numJewelsInStones(jewels: String, stones: String): Int {
    var count: Int = 0
    val map = hashMapOf<Char, Boolean>();
    for (jewel in jewels) {
        map[jewel] = true;
    }

    for (stone in stones) {
        if (map[stone] == true) {
            count++
        }
    }
    return count;
}