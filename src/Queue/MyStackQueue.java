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
        MoveValue1stStackTo2ndStack();
        return reverseStack.pop();
    }

    public Integer peek(){
        MoveValue1stStackTo2ndStack();
        return reverseStack.peek();
    }

    private void MoveValue1stStackTo2ndStack() {
        if (reverseStack.isEmpty())
            while (!stack.isEmpty())
                reverseStack.push(stack.pop());
    }

    public boolean isEmpty(){
        return stack.isEmpty() && reverseStack.isEmpty();
    }
}
