class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        var num = n.toDouble()
        while ( num > 1){
            num /= 4
        }
        return num == 1.0
    }
}