package Algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 8, 7, 6,11,9};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
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
     *  Merge sort call recursion 2 times in the body and reduce half per call, so
     *  Time Complexity of merge sort = NLogN, Best case = worst case = NLogN
     */

    public static void mergesort(int [] arr){
        if (arr.length < 2){
            return;
        }

        int mid = arr.length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = 0; i < (arr.length - mid); i++) {
            rightArr[i] = arr[mid + i];
        }

        mergesort(leftArr);
        mergesort(rightArr);
        concure(arr,leftArr,rightArr);
    }

    /*
     *  Time complexity of concure O(n)
     */
    private static void concure(int[] arr, int[] left, int[] right) {
        int l=0;
        int r=0;
        int counter = 0;
        while (l < left.length && r < right.length){
            if(left[l] < right[r]){
                arr[counter] = left[l++];
            }else {
                arr[counter] = right[r++];
            }
            counter++;
        }

        if(l < left.length){
            for (int i = l; i < left.length; i++){
                arr[counter++] = left[i];
            }
        }

        if(r < right.length){
            for (int i = r; i < right.length; i++){
                arr[counter++] = right[i];
            }
        }
    }

    /* mergesort(arr)
     * [5, 1, 2, 8, 6, 7, 11, 9]
     *
     *
     * if(aar.length < 2) == false
     * mid = arr.length /2  == 4
     * leftArr = [5, 1, 2, 8]
     * rightArr = [7, 6, 11, 9]
     *
     *
     * mergesort(leftArr) = [5, 1, 2, 8]
     *                      if(arr < 2 ) == false
     *                      mid = arr.length /2  == 2
     *                      leftArr = [5, 1]
     *                      rightArr = [2, 8]
     *
     *
     *                      mergesort(leftArr) = [5,1]
     *                                            if(arr < 2 ) == false
     *                                            mid = arr.length /2  == 1
     *                                            leftArr = [5]
     *                                            rightArr = [1]
     *                                            mergesort(leftArr) = [5]
     *                                                                 if(arr.length < 2) == true
     *                                                                 return
     *
     *                                            mergesort(rightArr) = [1]
     *                                                                  if(arr.length < 2) == true
     *                                                                  return
     *                                            concure(left[5] + right [1]) == leftArr[5,1] == [1,5]
     *
     *
     *                      mergesort(rightArr) = [2,8]
     *                                            if(arr < 2 ) == false
     *                                            mid = arr.length /2  == 1
     *                                            leftArr = [2]
     *                                            rightArr = [8]
     *                                            mergesort(leftArr) = [2]
     *                                                                    if(arr.length < 2) == true
     *                                                                    return
     *                                            mergesort(rightArr) = [8]
     *                                                                     if(arr.length < 2) == true
     *                                                                     return
     *                                            concure(left[2] + right [8]) == rightArr[2,8] == [2,8]
     *
     *
     *
     *                     concure(left[5,1] + right [2,8]) == leftArr[5,1,2,8] == [1,2,5,8]
     *
     *
     *
     *
     *
     *
     *
     * mergesort(rightArr) = [7, 6, 11, 9]
     *                       if(arr < 2 ) == false
     *                       mid = arr.length /2  == 2
     *                       leftArr = [7, 6]
     *                       rightArr = [11, 9]
     *
     *                      mergesort(leftArr) = [7,6]
     *                                             if(arr < 2 ) == false
     *                                             mid = arr.length /2  == 1
     *                                             leftArr = [7]
     *                                             rightArr = [6]
     *                                             mergesort(leftArr) = [7]
     *                                                                   if(arr.length < 2) == true
     *                                                                   return
     *                                             mergesort(rightArr) = [6]
     *                                                                    if(arr.length < 2) == true
     *                                                                    return
     *                                             concure(left[7] + right [6]) == leftArr[7,6] == [6,7]
     *
     *
     *                      mergesort(rightArr) = [11,9]
     *                                             if(arr < 2 ) == false
     *                                             mid = arr.length /2  == 1
     *                                             leftArr = [11]
     *                                             rightArr = [9]
     *                                             mergesort(leftArr) = [11]
     *                                                                   if(arr.length < 2) == true
     *                                                                   return
     *                                            mergesort(rightArr) = [9]
     *                                                                    if(arr.length < 2) == true
     *                                                                    return
     *                                            concure(left[11] + right [9]) == rightArr[11,9] == [9,11]
     *
     *
     *
     *                      concure(left[7,6] + right [11,9]) == leftArr[7,6,11,9] == [6,7,9,11]
     *
     *
     *
     *
     *
     * concure(left[5, 1, 2, 8] + right [7, 6, 11, 9]) == arr[5, 1, 2, 8, 6, 7, 11, 9] == [1, 2, 5, 6, 7, 8, 9, 11]
     *
     *
     *
     *
     * */
}
