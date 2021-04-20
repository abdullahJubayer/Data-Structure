package Queue;

import java.util.Arrays;

public class MyPriorityQueue {
    private int[] queue = new int[5];
    private int count = 0;


    public void add(int newItem) {
        if (isFull())
            increaseQueueSize();
        int index = shiftItemToInsert(newItem);
        queue[index] = newItem;
        count++;

    }

    private void increaseQueueSize() {
        int[] newQueue = new int[queue.length + 1];
        for (int i = 0; i < queue.length; i++) {
            newQueue[i] = queue[i];
        }
        queue = newQueue;
    }

    private int shiftItemToInsert(int newItem) {
        int i;
        for (i = count - 1; i >= 0; i--)
            if (queue[i] > newItem)
                queue[i + 1] = queue[i];
            else
                break;

        return i + 1;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        return queue[--count];
    }


    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    @Override
    public String toString() {
        return "MyPriorityQueue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }
}
