class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var result = ArrayList<Int>()
        var sum = 0
        for(num in nums){
        sum += num
        result.add(sum)
        } 

    return result.toIntArray()
    }
}