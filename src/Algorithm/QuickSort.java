package Algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1,2,3,3,5,5,4,4};
        quickSort(arr2,0,arr2.length-1);
        System.out.println(Arrays.toString(arr2));
    }



    /*
     * If recursive function execution reduce 1 per call then complexity = T(n-1)+O(1)  = O(n)
     */

    /*
     * If recursive function execution reduce half per call then complexity = T(n/2)+O(n)  = O(n)
     */


    /*
     * If recursive function execution reduce 1 per call  and
     * If recursive function call recursion 2 times then complexity = 2T(n-1)+O(1)  = O(2^n)
     */

    /*
     * If recursive function execution reduce half per call  and
     * If recursive function call recursion 2 times then complexity = 2T(n/2)+O(n)  = O(NLogN)
     */


    /*
     *  QuickSort sort call recursion 2 times in the body, so
     *  Time Complexity of quick sort = NLogN, Best case = NLogN, worst case = O(n^2)
     */
    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = arr[high];
        int leftPointer = low;
        int rightPointer = high-1;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] < pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] > pivot && rightPointer > leftPointer) {
                rightPointer--;
            }

            swap(arr,leftPointer,rightPointer);
        }

        if(pivot < arr[leftPointer]){
            swap(arr,leftPointer,high);
        }

        quickSort(arr,low,leftPointer-1);
        quickSort(arr,leftPointer+1,high);
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}

/* quickSort(arr)
 * [5 , 1, 2,   8 ]
 *  ^           ^
 * low =0      high=3   = low > high == false
 *
 * pivot = arr[high] == 8
 * leftPointer =  low == 0
 * rightPointer = high-1 = 3-1 == 2
 *
 * while (leftPointer < rightPointer) = (0 < 2)
 *
 *        while (arr[leftPointer] < pivot && leftPointer < rightPointer) = (5 < 8 && 0 < 2)
 *                  5              8
 *                  ^              ^
 *            arr[leftPointer] < pivot = leftPointer++ == 1
 *
 *                  1              8
 *                  ^              ^
 *            arr[leftPointer] < pivot = leftPointer++ == 2
 *
 *                  2              8                   2      <     2
 *                  ^              ^
 *            arr[leftPointer] < pivot == true && leftPointer < rightPointer  == false
 *
 *
 *
 *
 *        while (arr[rightPointer] > pivot && rightPointer > leftPointer) = (2 > 8) == false
 *        swap(arr, leftPointer, rightPointer) == [5 , 1, 2, 8]
 *
 *
 * if(pivot > arr[leftPointer]) = (8 > 2) == false
 * quickSort(arr, 0, leftPointer -1) ==  quickSort(arr 0 , 1)
 * quickSort(arr, leftPointer + 1 , high) ==  quickSort(arr 3 , 3)
 *
 */
