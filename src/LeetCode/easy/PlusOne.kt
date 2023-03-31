package LeetCode.easy

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        var onHand = 1


        for (i in digits.size - 1 downTo 0) {

            if (digits[i].plus(onHand) > 9) {
                digits[i] = 0
            } else {
                digits[i] = digits[i] + onHand
                onHand = 0
            }
        }


        if (onHand > 0) {
            val newArr = IntArray(digits.size.plus(1))
            newArr[0] = 1
            return newArr
        }
        return digits
    }
}