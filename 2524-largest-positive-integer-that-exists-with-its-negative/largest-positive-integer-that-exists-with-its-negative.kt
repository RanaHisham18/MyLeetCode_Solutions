class Solution {
    fun findMaxK(nums: IntArray): Int {
        nums.sort()
        var low = 0
        var high = nums.size - 1
        while (low < high) {
            if (-nums[low] == nums[high]) {
                return nums[high]
            } else if (-nums[low] > nums[high]) {
                low++
            } else {  
                high--
            }
        }
        return -1  
    }
}
