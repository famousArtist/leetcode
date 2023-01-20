package leetcode.easy.arrays

//https://leetcode.com/problems/running-sum-of-1d-array/
class RunningSum1dArray {
}

fun main() {
    println(runningSum(intArrayOf(1, 2, 3, 4)))
}
// my first solution
fun runningSum(nums: IntArray): IntArray {
    for (i: Int in 1..nums.size - 1) {
        nums[i] += nums[i - 1]
    }
    return nums
}

//Koltin map solution
fun runningSum1(nums: IntArray): IntArray {
    var sum = 0
    return nums.map(){sum += it; sum}.toIntArray()
}

// other oneline solution
fun runningSum2(nums: IntArray): IntArray =
    nums.also { (1..nums.lastIndex).forEach { nums[it] += nums[it-1] } }