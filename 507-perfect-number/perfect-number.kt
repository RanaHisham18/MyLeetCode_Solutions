class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        //val divisors = StringBuilder()
        if (num <= 1) return false 
        var divisors: MutableList<Int> = mutableListOf()
        var sum = 0
  for (i in 1..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) {
                divisors.add(i)
                if (i != 1 && i != num / i) {
                    divisors.add(num / i)  
                }
            }
        }
        for (i in 0 until divisors.size){
sum+=divisors[i]
        }
        if (sum == num) {return true}
        else{
            return false
        }
    }
}