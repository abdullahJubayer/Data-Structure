package Queue;

import java.util.Arrays;

public class MyArrayQueue {
    private int[] queue = new int[5];
    private int last = 0;
    private int first = 0;


    //[ 0, 0 , 0 ,0]
    // f       l
    public void add(int val) {
        if (last == queue.length)
            throw new IllegalStateException();
        else
            queue[last++] = val;
    }

    public void offer(int val) {
        if (last < queue.length)
            queue[last++] = val;
    }


    public void remove() {
        if (first == last)
            throw new IllegalStateException();
        else
            queue[first++] = 0;

    }

    public int peek() {
        if (first == last)
            throw new IllegalStateException();
        else
            return queue[first];
    }

    public int poll() {
        if (first == last)
            throw new IllegalStateException();
        else {
            var element = queue[first];
            remove();
            return element;
        }
    }

    public boolean isEmpty() {
        return first == last;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(queue, first, last));
    }
}
