package LinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(20);
        myLinkedList.addLast(40);
        myLinkedList.addLast(60);
        myLinkedList.addLast(80);
        System.out.println(Arrays.toString(myLinkedList.toArray()));
        myLinkedList.reverse();
        System.out.println(Arrays.toString(myLinkedList.toArray()));
    }
}
