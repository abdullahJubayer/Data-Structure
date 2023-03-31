package LeetCode.easy

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {

        if (nums.isEmpty())
            return 0

        var start=0
        var end=nums.size-1

        while (start <= end){
            val mid=(start+end)/2

            if (target==nums[mid])
                return mid

            if (nums[mid] < target)
                start=mid+1
            else
                end=mid-1
        }

        return  start
    }
}