class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var x = if (nums.size > 0) 1 else 0

        for (i in 1 until nums.size) {
            if (nums[i] == nums[i-1])
            continue
            //skip this iteration
            nums[x] = nums[i]
            x++
        }
        return x
    }
}