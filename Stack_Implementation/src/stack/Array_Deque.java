package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Array_Deque<Xyz> {
    private Deque<Xyz> deque;

    public Array_Deque() {
        deque = new ArrayDeque<>();
    }

    // Push element onto the stack
    public void push(Xyz element) {
        deque.addFirst(element);
    }

    // Pop element from the stack
    public Xyz pop() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop element.");
        }
        return deque.removeFirst();
    }

    // Peek the top element of the stack
    public Xyz peek() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek element.");
        }
        return deque.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        // Create a stack using StackUsingArrayDeque
        Array_Deque<Integer> myStack = new Array_Deque<>();

        // Push elements onto the stack
        myStack.push(15);
        myStack.push(56);
        myStack.push(158);

        System.out.println("Top element is: " + myStack.peek());
        int poppedElement = myStack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Is the stack empty? " + myStack.isEmpty());

        System.out.println("Size of the stack: " + myStack.size());
    }
}
