package steque;

import java.util.Deque;
import java.util.LinkedList;

public class Steque_Using_Deque<Xyz> {
    private Deque<Xyz> deque;

    public Steque_Using_Deque() {
        deque = new LinkedList<>();
    }

    public void push(Xyz element) {
        deque.addFirst(element);
    }

    public void enqueue(Xyz element) {
        deque.addLast(element);
    }

    public Xyz pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty. Cannot pop element.");
        }
        return deque.removeFirst();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        Steque_Using_Deque<Integer> steque = new Steque_Using_Deque<>();
        steque.push(10);
        steque.push(20);
        steque.enqueue(30);
        
        System.out.println("Popped element: " + steque.pop());
        System.out.println("Is the steque empty? " + steque.isEmpty());
        System.out.println("Size of the steque: " + steque.size());
    }
}
