class Solution {
    fun isAcronym(words: List<String>, s: String): Boolean {
        val acronym = StringBuilder()
        for (word in words) {
            if (word.isNotEmpty()) {
                acronym.append(word.first())
            }
        }
        return s == acronym.toString()
    }
}
