package leetcode.easy

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var resultNum = 0;
        for (num in nums){
            if(count == 0){
                resultNum = num
            }
            count += if (num == resultNum) 1 else -1
        }
        return resultNum
    }
}