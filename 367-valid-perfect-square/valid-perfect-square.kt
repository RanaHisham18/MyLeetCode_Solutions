class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        val squareRoot = sqrt(num.toDouble())
        if (squareRoot % 1.0 == 0.0){
            return true
        }
        else{
            return false
        }
        
    }
}