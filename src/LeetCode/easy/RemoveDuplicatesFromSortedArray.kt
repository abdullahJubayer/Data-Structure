package LeetCode.easy

class RemoveDuplicatesFromSortedArray {
    var pointer = 0
    fun removeDuplicate(arr: IntArray): IntArray {
        for (i in 0 until arr.size) {
            val currentElement = arr[i]

            if (currentElement != -1111)
                for (j in i until arr.size)
                    if (currentElement == arr[j])
                        arr[j] = -1111

            if (currentElement != -1111)
                arr[pointer++] = currentElement
        }

        return arr
    }

    fun removeDuplicates(arr: IntArray): IntArray {
        var changedItem=1
        for (i in 0 until arr.size-1) {
            if (arr[i]<arr[i+1])
                arr[changedItem++]=arr[i+1]
        }

        return arr
    }
}