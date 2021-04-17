package Queue;

import java.util.Arrays;

public class MyArrayQueue {
    private int[] queue;
    private int font = 0;
    private int rear;
    private int count;


    public MyArrayQueue(int size){
        queue=new int[size];
    }

    //[ 0, 0 , 0 ,0]
    // f       l
    public void enqueue(int val) {
        if (count == queue.length)
            throw new IllegalStateException();
        else
            queue[rear] = val;
            rear=(rear+1)%queue.length;
            count++;
    }


    public int dequeue() {
        if (font == count)
            throw new IllegalStateException();
        else{
            var fontItem=queue[font];
            queue[font]=0;
            font=(font+1)%queue.length;
            count--;
            return fontItem;
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
