package LinkedList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyLinkedList {
    private Node firstNode;
    private Node lastNode;


    //add First
    /*Time Complexity of this method is O(1)
     * Because It Simply create new Node,and
     * assigned first node to it.Not Depend on input
     * */
    public void addFirst(int item) {
        var newNode = new Node(item);
        if (isEmpty()) {
            firstNode = lastNode = newNode;
        } else {
            newNode.setNextNode(firstNode);
            firstNode = newNode;
        }
    }

    //add Last
    /*Time Complexity of this method is O(1)
     * Because It Simply create new Node,and
     * assigned Last node to it.Not Depend on input
     * */
    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            firstNode = lastNode = node;
        else {
            lastNode.setNextNode(node);
            lastNode = node;
        }
    }

    //delete First
    /*Time Complexity of this method is O(1)
     * Because It Simply hold Second Node Ref,and
     * assigned First node to Second Node.Not Depend on input
     * */
    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Item is Null");
        }
        if (firstNode.getNextNode() == null)
            firstNode = lastNode = null;
        else {
            var firstRef = firstNode.getNextNode();
            firstNode.setNextNode(null);
            firstNode = firstRef;
        }
    }

    //delete Last
    /*Time Complexity of this method is O(n)
     * Because First we need before the last Node,So
     * we Travrase all item and find the before last node.
     * then we delete the last node.
     * */
    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException("Item is Null");
        else {
            var privious = beforeLastNode(lastNode);
            privious.setNextNode(null);
            lastNode = privious;
        }
    }

    //Time Complexity of this method is O(n)
    private Node beforeLastNode(Node node) {
        var beforeLast = firstNode;
        while (beforeLast != null) {
            if (beforeLast.getNextNode() == node)
                return beforeLast;
            beforeLast = beforeLast.getNextNode();
        }
        return null;
    }

    //contains
    //Time Complexity of this method is O(n)
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    //indexOf
    //Time Complexity of this method is O(n)
    public int indexOf(int item) {
        int index = 0;
        var first = firstNode;
        while (first != null) {
            if (first.getItem() == item) return index;
            first = first.getNextNode();
            index++;
        }
        return -1;
    }

    public int size() {
        int index = 0;
        var first = firstNode;
        while (first != null) {
            index++;
            first = first.getNextNode();
        }
        return index;
    }

    public int[] toArray() {
        var first = firstNode;
        int[] arr = new int[size()];
        for (int i = 0; i < size(); i++) {
            arr[i] = first.getItem();
            first = first.getNextNode();
        }
        return arr;
    }


    /*Time Complexity of this method is O(n).
        Because while loop depends on first node.
        if first node references more Node then execution time is increase
    * */
    public void reverse() {
        //Node=[10->20->30->40]
        var privious = firstNode;
        var current = firstNode.getNextNode();
        privious.setNextNode(null);
        while (current != null){
            var next=current.getNextNode();
            current.setNextNode(privious);

            privious=current;
            current=next;

        }

        lastNode=firstNode;
        lastNode.setNextNode(null);
        firstNode=privious;
    }

    private boolean isEmpty() {
        return firstNode == null;
    }
}
