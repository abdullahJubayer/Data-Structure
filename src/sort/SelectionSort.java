package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={10,5,2,8,7};
        System.out.println(Arrays.toString(sort(arr,arr.length)));
    }

    private static int[] sort(int[] arr,int size){
        int smallNumberPointer=0;
        int positionPointer=0;

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[j] < arr[smallNumberPointer])
                    smallNumberPointer=j;
            }

            int temp=arr[smallNumberPointer];
            arr[smallNumberPointer]=arr[positionPointer];
            arr[positionPointer]=temp;
            smallNumberPointer=i;
            positionPointer=i;
        }

        return arr;
    }
}
