package LeetCode.easy

class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        val chars = s.toCharArray()
        var lastWordSize = 0
        var currentWordSize = 0
        for (i in chars.indices) {
            if (chars[i] == ' ') {
                currentWordSize = 0
            } else {
                currentWordSize++
            }

            if (currentWordSize > 0)
                lastWordSize = currentWordSize
        }
        return lastWordSize
    }
}