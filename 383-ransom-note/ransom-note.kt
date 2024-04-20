class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val stringBuilder = StringBuilder(magazine)
            for (char in ransomNote) {
            val index = stringBuilder.indexOf(char)
            if (index == -1) {
                return false
            } else {
                stringBuilder.deleteCharAt(index)
            }
        }
        return true
    }
}