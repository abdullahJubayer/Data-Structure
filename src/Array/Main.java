package Array;

import Array.MyArray;

public class Main {
    public static void main(String[] args) {
        MyArray array=new MyArray(3);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.print();
        array.removeAt(2);
        array.removeLast();
        array.print();

        array.indexOf(1);
        array.showSize();
    }
}
