package Algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 8, 7, 6};
        sortAsc(arr);
        System.out.println(Arrays.toString(arr));
        sortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortAsc(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length -1) - i; j++) {
                if(arr[j] > arr [j+1]){
                    swapValue(arr,j,j+1);
                }
            }
        }
    }

    private static void sortDesc(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length -1) - i; j++) {
                if(arr[j] < arr [j+1]){
                    swapValue(arr,j,j+1);
                }
            }
        }
    }

    private static void swapValue(int[] arr,int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
}
