package stackusinglinkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.println();

        System.out.println("Top element is " + stack.peek());
        System.out.println();

        System.out.println("Stack elements are :");
        stack.printStack();
        System.out.println();

        System.out.println(stack.pop() + " popped from stack");
        System.out.println();
        System.out.println("Stack elements after pop :");
        stack.printStack();
    }
}
