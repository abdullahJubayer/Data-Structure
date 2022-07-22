package sort;

import java.util.Arrays;

public class InsertionSort {
    //int arr[]={10,5,2,7,8}

    public static void main(String[] args) {
        int arr[]={10,5,2,7,8};
        int arr2[]={2,3,5,7,9,8};

        System.out.println(Arrays.toString(sort(arr,arr.length))); // O(n^2)
        System.out.println(Arrays.toString(sort(arr2,arr2.length))); // Almost O(n)
    }

    private static int[] sort(int arr[],int size){
        int temp,siftingPos;
        for (int i = 1; i < size; i++) {
            temp=arr[i];
            siftingPos=i-1;

            while (siftingPos >= 0 && arr[siftingPos] > temp){
                arr[siftingPos+1]=arr[siftingPos];
                siftingPos=siftingPos-1;
            }

            arr[siftingPos+1]=temp;
        }
        return arr;
    }
}
