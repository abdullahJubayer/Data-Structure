package Queue;

import java.util.Arrays;
import java.util.Stack;

public class MyStackQueue {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> reverseStack;

    public void enqueue(int item){
        stack.push(item);
    }

    public Integer dequeue(){
        if (stack.isEmpty())
            throw new IllegalStateException();
        reverseStack=new Stack<>();
        while (!stack.isEmpty()){
            reverseStack.push(stack.pop());
        }
        var font=reverseStack.pop();
        while (!reverseStack.isEmpty()){
            stack.push(reverseStack.pop());
        }
        return font;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack.toArray());
    }
}
