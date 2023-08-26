
class Solution {
    fun climbStairs(n: Int): Int {
        val arr = IntArray(n+1)
        arr[0] = 1
        arr[1] = 1
        var i = 2
        while(i <= n){
            arr[i] = arr[i-1] + arr[i-2]
            i++
        }
        return arr[n]
    }
}