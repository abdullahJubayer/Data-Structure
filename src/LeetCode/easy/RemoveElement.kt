package LeetCode.easy

class RemoveElement {
    fun removeElement(arr: IntArray,element:Int): IntArray {
        var currentPos=0
        for (i in 0 until arr.size) {
            if (arr[i]!=element)
                arr[currentPos++]=arr[i]
        }

        return arr
    }
}