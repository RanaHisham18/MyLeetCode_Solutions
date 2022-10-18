class Solution {
    
    fun maxSubArray(nums: IntArray): Int {
      var currsum = 0
      var maxsum = Integer.MIN_VALUE
        for (i in 0 until nums.size){
            currsum += nums[i] 
            if (currsum > maxsum){
                maxsum = currsum
            }
            if (currsum<0){
                currsum = 0
            }
        }
        
        
     return maxsum}
}