class Solution {
    fun reverseWords(s: String): String {
 val strList = s.split(" ")  
    val sb = StringBuilder()
    for (items in strList) {
        if (items != "") { 
         val rev = StringBuilder(items).reverse().toString() 
            sb.append("$rev ")
        }
    }

    return sb.toString().trim()
}
    }   
