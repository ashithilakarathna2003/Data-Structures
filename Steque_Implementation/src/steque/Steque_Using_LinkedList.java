package steque;

public class Steque_Using_LinkedList<Xyz> {
    private class Node {
    	Xyz data;
        Node next;

        Node(Xyz data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Steque_Using_LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void push(Xyz element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void enqueue(Xyz element) {
        Node newNode = new Node(element);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Xyz pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty. Cannot pop element.");
        }
        Xyz data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Steque_Using_LinkedList<Integer> steque = new Steque_Using_LinkedList<>();
        steque.push(20);
        steque.push(30);
        steque.enqueue(40);
        
        System.out.println("Popped element: " + steque.pop());
        System.out.println("Is the steque empty? " + steque.isEmpty());
        System.out.println("Size of the steque: " + steque.size());
    }
}
