package fifo;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new RuntimeException("Queue Overflow!!");
        }
        rear = (rear + 1) % maxSize;
        queue[rear] = item;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Underflow!!");
        }
        int item = queue[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty!!");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek()); 

        queue.enqueue(60);
        System.out.println("Front element after enqueue 60: " + queue.peek()); 

        System.out.println("Queue elements:");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " "); 
        }
    }
}

