package Stack;

import java.util.EmptyStackException;

public class MyStack {
    private int currentPos = 0;
    private int[] stack;

    //push
    //time complexity of this method is O(n)
    //because it has a for loop . and for loop depend on currentItem.which maybe increase or decrease
    public void push(int val) {
        if (isEmpty())
            stack = new int[1];
        if (stack.length == currentPos) {
            int[] newStack = new int[currentPos * 2];
            for (int i = 0; i < currentPos; i++)
                newStack[i] = stack[i];
            stack = newStack;
        }
        stack[currentPos++] = val;
    }

    //pop
    //time complexity of this method is O(1)
    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        var pop=peek();
        stack[currentPos-1]=0;
        currentPos--;
        return pop;
    }

    //peek
    //time complexity of this method is O(1)
    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return stack[currentPos-1];
    }
    //isEmpty
    //time complexity of this method is O(1)
    public boolean isEmpty() {
        return stack == null || stack.length == 0;
    }

    public int[] getStackAsArray() {
        if (isEmpty())
            throw new IllegalStateException();
        return stack;
    }

}
