package fifo_linkedList;

public class Queue {
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println(data + " enqueued to queue");
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(data + " enqueued to queue");
    }

    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }

        return temp.data;
    }

    public int peek() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return this.front.data;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
