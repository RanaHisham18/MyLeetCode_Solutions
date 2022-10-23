class Solution {
    fun firstUniqChar(s: String): Int {
        s.forEachIndexed { index, char ->
            if(s.indexOf(char) == s.lastIndexOf(char)) {
                return index
            }
        } 
        return -1
    }
}