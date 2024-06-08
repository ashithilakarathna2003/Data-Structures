package stack;

import java.util.Stack;

public class Linked_List<Xyz> {
	private Node<Xyz> head;
    private int size;

    public void Stack() {
        head = null;
        size = 0;
    }

    // Node class to store data and reference to next node
    private static class Node<Xyz> {
        private Xyz data;
        private Node<Xyz> next;

        public Node(Xyz data) {
            this.data = data;
        }
    }

    // Push operation 
    public void push(Xyz data) {
        Node<Xyz> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Pop operation 
    public Xyz pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Node<Xyz> temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    // Peek operation 
    public Xyz peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the size of the stack
    public int size() {
        return size;
    }

	 

	    public static void main(String[] args) {
	    	 // Create a stack of integers
	        Stack<Integer> myStack = new Stack<>();

	        // Push elements onto the stack
	        myStack.push(10);
	        myStack.push(20);
	        myStack.push(30);

	        // Print the top element (peek)
	        System.out.println("Top element is: " + myStack.peek());
	        int poppedElement = myStack.pop();
	        System.out.println("Popped element: " + poppedElement);
	        System.out.println("Is the stack empty? " + myStack.isEmpty());
	        System.out.println("Size of the stack: " + myStack.size());
	    }
	      
	    }
	
