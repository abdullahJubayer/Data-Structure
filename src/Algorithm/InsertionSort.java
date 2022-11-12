package Algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 8, 7, 6};
        int key;
        int j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) { //hare j>=0 because array starting index is 0
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }

    /*     j  i
     *   [ 5, 1 , 2 , 8 , 7 , 6 ] key=>arr[i]=>1, j=0,  arr[j]=5,  if(j >= 0 && arr[j] > key)=true so arr=[1,5,2,8,7,6]
     *
     *
     *        j   i
     *   [ 1, 5 , 2 , 8 , 7 , 6 ] key->arr[i]->2, j=1,  arr[j]=5,  if(j >= 0 && arr[j] > key)=true so arr=[1,2,5,8,7,6]
     *
     *
     *            j   i
     *   [ 1, 2 , 5 , 8 , 7 , 6 ] key->arr[i]->8, j=2, arr[j]=5,  if(j >= 0 && arr[j] > key)=false so arr=[1,2,5,8,7,6]
     *
     *
     *                j   i
     *   [ 1, 2 , 5 , 8 , 7 , 6 ] key->arr[i]->7, j=3, arr[j]=8,  if(j >= 0 && arr[j] > key)=true so arr=[1,2,5,7,8,6]
     *
     *
     *                    j   i
     *   [ 1, 2 , 5 , 7 , 8 , 6 ] key->arr[i]->6, j=4, arr[j]=8,  if(j >= 0 && arr[j] > key)=true so arr=[1,2,5,7,6,8]
     *
     *
     *                j       i
     *   [ 1, 2 , 5 , 7 , 6 , 8 ] key=6, j=3, arr[j]=7,  if(j >= 0 && arr[j] > key)=true so arr=[1,2,5,6,7,8]
     *
     * */
}
