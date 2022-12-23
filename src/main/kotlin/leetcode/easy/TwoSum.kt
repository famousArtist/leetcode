package leetcode.easy

class TwoSum {
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in 0..nums.size){
        val desire = target - nums[i]
        if (map.containsKey(desire)){
            return intArrayOf(map[desire]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}