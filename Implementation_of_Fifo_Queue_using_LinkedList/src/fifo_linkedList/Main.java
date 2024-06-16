package fifo_linkedList;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(12);
        queue.enqueue(20);
        queue.enqueue(25);
        System.out.println();

        System.out.println("Front element is " + queue.peek());
        System.out.println();

        System.out.println("Queue elements are :");
        queue.printQueue();
        System.out.println();

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println();
        System.out.println("Queue elements after dequeue :");
        queue.printQueue();
    }
}
