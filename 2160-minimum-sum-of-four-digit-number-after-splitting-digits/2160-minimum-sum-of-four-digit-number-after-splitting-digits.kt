class Solution {
    fun minimumSum(num: Int): Int {
     var newNum = num.toString().toList().sorted()
    var new1 = newNum[0].toString() + newNum[2]
    var new2 = newNum[1].toString() + newNum[3]
    return new1.toInt() + new2.toInt() 
    }
}
