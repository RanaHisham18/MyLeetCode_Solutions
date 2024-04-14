class Solution {
    fun removeOuterParentheses(s: String): String {
        val resultString = StringBuilder()
        var counter = 0
        for (c in s){
            if (c == '(' && counter ++>0){
                resultString.append(c)
            }
            if (c == ')' && counter -->1){
                resultString.append(c)
            }
        }
       return resultString.toString() 
    }
}