import java.util.*

class Play {
    fun removeDuplicate(arr:IntArray): IntArray {
        var key=0
        var currentPos=0
        for (i in 0 until arr.size){
            key=arr[i]
            for (j in 0 until arr.size){
                if (arr[j]==key){
                    arr[j]=0
                }
            }
            if (key != 0){
                arr[currentPos]=key
                currentPos++
            }

        }

        return arr
    }
}

fun main() {
    val arr= intArrayOf(1,1,2,2,2,3,4)
    print(Play().removeDuplicate(arr).contentToString())
}
