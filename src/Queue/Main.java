package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        Queue<Integer> queue=new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        System.out.println(reverseQueue(queue));

        MyArrayQueue myArrayQueue=new MyArrayQueue();
        myArrayQueue.add(10);
        myArrayQueue.add(20);
        myArrayQueue.add(30);
        myArrayQueue.remove();
        myArrayQueue.remove();
        myArrayQueue.remove();
        myArrayQueue.add(10);
        System.out.println(myArrayQueue);
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack=new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }

        return queue;
    }
}
