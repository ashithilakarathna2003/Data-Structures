package fifo;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue<Xyz> {
    private Queue<Xyz> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(Xyz element) {
        queue.offer(element);
    }

    public Xyz dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue element.");
        }
        return queue.poll();
    }

    public Xyz peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek element.");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> myQueue = new LinkedListQueue<>();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        System.out.println("Front element: " + myQueue.peek());
        System.out.println("Dequeued element: " + myQueue.dequeue());
        System.out.println("Is the queue empty? " + myQueue.isEmpty());
        System.out.println("Size of the queue: " + myQueue.size());
    }
}

