class Solution {
    fun largestOddNumber(num: String): String {
        for (i in num.indices.reversed()){
            if (num[i].digitToInt() % 2 != 0){
                return num.substring(0..i)
            }
        }
      return ""  
    }
}