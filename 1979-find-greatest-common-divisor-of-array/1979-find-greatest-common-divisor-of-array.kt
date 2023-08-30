class Solution {
    fun findGCD(nums: IntArray): Int {
        var toList = nums.toList()
        var min = toList.min()
        var max = toList.max()
        var result = 0
        for (i in 1..min){
            if ( min%i == 0 && max%i == 0){
                result = i  
            }
        }

     return result   
    }
}