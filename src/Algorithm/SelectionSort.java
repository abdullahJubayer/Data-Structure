package Algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={1,10,5,11,2,8,7};
        sortAsc(arr,arr.length);
        System.out.println(Arrays.toString(arr));
        sortDesc(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortAsc(int[] arr,int size){
        for (int i = 0; i < size; i++) {
            int tempPos=i;
            for (int j = i; j < size; j++) {
                if (arr[j] < arr[tempPos])
                    tempPos=j;
            }

            swapValue(arr,i,tempPos);
        }
    }

    private static void sortDesc(int[] arr,int size){
        for (int i = 0; i < size; i++) {
            int tempPos=i;
            for (int j = i; j < size; j++) {
                if (arr[j] > arr[tempPos])
                    tempPos=j;
            }

            swapValue(arr,i,tempPos);
        }
    }


    private static void swapValue(int[] arr,int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
}
