package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
    private int count = 0;
    private int[] stack=new int[5];

    //push
    public void push(int val) {
        if (stack.length==count)
            throw new IllegalStateException();
        stack[count++]=val;
    }

    //pop
    public int pop(){
        if (count==0)
            throw new EmptyStackException();
        return stack[--count];
    }

    //peek
    //time complexity of this method is O(1)
    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return stack[count-1];
    }
    //isEmpty
    //time complexity of this method is O(1)
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(stack,0,count));
    }
}
