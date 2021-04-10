package Array;

public class MyArray {
    private int[] array;
    private int currentItemPos=0;

    /*Space Complexity of this array is O(n)
    * Because when we Increases the size of value  the array need more space
    * Example: when we increase 1,the array need extra 4 byte in memory and it increases linearly*/
    public MyArray(int size){
        array=new int[size];
    }

    /*Time Complexity of this method is O(n)
     * Because the worst case Scenario is, when array.length == currentItemPos
     * Then we need to do 2 thins, 1.Increase the size of array 2.Copy Previous Item to new Array
     * So we need Double work hare
     * */
    public void add(int item){
        if (array.length == currentItemPos) {
            int[] newArray = new int[currentItemPos * 2];
            for (int i = 0; i < currentItemPos; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[currentItemPos++]=item;
    }

    /*Time Complexity of this method is O(n)
     * Because we need to find the index of item .
     * and remove the item
     * */
    public void removeItem(int item){
        if (item<currentItemPos){
            for (int i=0;i<currentItemPos;i++){
                if (array[i]==item){
                    array[i]=0;
                    break;
                }
            }
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /*Time Complexity of this method is O(n)
     * Because first we need to swap the item.
     * and then remove the item
     * */
    public void removeAt(int index){
        if (index<currentItemPos && index>=0){
            for (int i=index;i<currentItemPos;i++){
                array[i]=array[i++];
            }
            currentItemPos--;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /*Time Complexity of this method is O(1)
     * Because this method simply delete the last index of array
     * So Execution time is fixed
     * */
    public void removeLast(){
        if (currentItemPos>0){
            array[currentItemPos--]=0;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void indexOf(int item){
        for (int i=0;i<currentItemPos;i++){
            if (array[i]==item){
                System.out.println("Index : "+i);
            }else {
                System.out.println("Index : "+-1);
            }
        }
    }

    /*Time Complexity of this method is O(n)
     * Because when we Increases the size of value the method need more execution Time
     * Example: when we increase 1 and suppose, execution time is 1s per print,Then
     * The method need extra 1s second to print the value the it's increase linearly*/
    public void printAll(){
        for (int val : array){
            System.out.println(val);
        }
    }
    public void print(){
        for (int v=0; v<currentItemPos ; v++){
            System.out.println(array[v]);
        }
    }


    /*Time Complexity of this method is O(1)
    * Because Execution time is Constant
    * if we execute 100 times this method,the Time complexity are same
    * Because this execution is not dependent on array size
    * */
    public void showSize(){
        System.out.println("Length : "+array.length);
    }
}
