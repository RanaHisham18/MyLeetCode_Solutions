class Solution {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val indices = ArrayList<Int>()
        for (index in words.indices) {  // Use indices to directly access each word's index
            if (words[index].contains(x)) {
                indices.add(index)
            }
        }
        return indices
    }
}
