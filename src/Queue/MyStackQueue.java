package Queue;

import java.util.Arrays;
import java.util.Stack;

public class MyStackQueue {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> reverseStack =new Stack<>();

    public void enqueue(int item){
        stack.push(item);
    }

    public Integer dequeue(){
        if (isEmpty())
            throw new IllegalStateException();
        if (reverseStack.isEmpty())
            while (!stack.isEmpty())
                reverseStack.push(stack.pop());
        return reverseStack.pop();
    }

    public boolean isEmpty(){
        return stack.isEmpty() && reverseStack.isEmpty();
    }
}
