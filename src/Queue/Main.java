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
//        System.out.println(queue.element());
//        System.out.println(queue.offer(4));
//        System.out.println(queue.peek());
//        System.out.println(queue);
//        System.out.println(queue.poll());
//        System.out.println(queue);

//        MyArrayQueue myArrayQueue=new MyArrayQueue(5);
//        myArrayQueue.enqueue(5);
//        myArrayQueue.enqueue(20);
//        myArrayQueue.enqueue(20);
//        myArrayQueue.enqueue(20);
//        myArrayQueue.enqueue(20);
//        myArrayQueue.dequeue();
//        myArrayQueue.enqueue(30);
//        System.out.println(myArrayQueue);

        MyStackQueue myStackQueue=new MyStackQueue();
        myStackQueue.enqueue(10);
        myStackQueue.enqueue(20);
        myStackQueue.enqueue(30);
        myStackQueue.dequeue();
        System.out.println(myStackQueue);
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
