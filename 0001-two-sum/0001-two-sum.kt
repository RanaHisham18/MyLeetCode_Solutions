class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // loop on the first num
        for (i in 0 until nums.size) {
            //loop on the second num
        for (j in i + 1 until nums.size) { 
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            } 
    }
}
        throw IllegalArgumentException("No solution") }
  
}