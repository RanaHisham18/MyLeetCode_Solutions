class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var i = 0
        var j = nums.size-1
        var middle = 0
        while (i<=j){
           middle = (i+j)/2
            
            if (target > nums [middle]){
                i = middle + 1
            }
            else if (target < nums [middle]) {
                j = middle -1 }
            else{
                return middle
            }
            }
        return i 
        } 
        
    }

