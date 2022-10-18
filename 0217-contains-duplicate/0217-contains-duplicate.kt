class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        for (i in 0 until nums.size){
            for (j in i + 1 until nums.size){
                if (nums [i] == nums [j]){
                  return true 
                    break
                } 
               
            }
        }

     return false 
    } 
    
}