package LeetCode.easy

class FindIndexOfTheFirstOccurrenceInAString {
    fun strStr(haystack: String, needle: String): Int {
        return haystack.indexOf(needle, ignoreCase = true)
    }
}