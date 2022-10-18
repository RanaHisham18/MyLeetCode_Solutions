class Solution {
    fun singleNumber(nums: IntArray): Int {
       var result = 0
        for ( i in nums){
            result = i.xor(result)
        }
        return result
    }
}