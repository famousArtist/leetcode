package leetcode.easy
//https://leetcode.com/problems/build-array-from-permutation/
class BuildArrayFromPermutation {


}

fun buildArray(nums: IntArray): IntArray {
    var array = mutableSetOf<Int>()

    for (element in nums){
        array.add(nums[element])
    }
    return array.toIntArray();
}