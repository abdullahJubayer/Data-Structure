package Algorithm;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 1;
        System.out.println(recursionSearch(arr,0,arr.length -1,target));
    }



    /*
     *  Time Complexity of BinarySearch  = LogN, Best case = Worst case =  LogN
     */
    public static int search(int[] arr,int l,int r, int target) {
        while (l < r) {
            int mid = l+(r-l)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid])
                l = mid + 1;

            if (target < arr[mid])
                r = mid;
        }

        return -1;
    }

    public static int recursionSearch(int[] arr,int l,int r, int target) {
            if (l>=r){
                return -1;
            }

            int mid = l+(r-l)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid])
                l = mid + 1;

            if (target < arr[mid])
                r = mid;

        return recursionSearch(arr,l,r,target);
    }
}
