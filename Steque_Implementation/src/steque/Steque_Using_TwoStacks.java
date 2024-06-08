package steque;

import java.util.Stack;

public class Steque_Using_TwoStacks<Xyz> {
    private Stack<Xyz> stack1;
    private Stack<Xyz> stack2;

    public Steque_Using_TwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(Xyz element) {
        stack1.push(element);
    }

    public void enqueue(Xyz element) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(element);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public Xyz pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty. Cannot pop element.");
        }
        return stack1.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public int size() {
        return stack1.size();
    }

    public static void main(String[] args) {
        Steque_Using_TwoStacks<Integer> steque = new Steque_Using_TwoStacks<>();
        steque.push(10);
        steque.push(20);
        steque.enqueue(30);
        
        System.out.println("Popped element: " + steque.pop());
        System.out.println("Is the steque empty? " + steque.isEmpty());
        System.out.println("Size of the steque: " + steque.size());
    }
}
