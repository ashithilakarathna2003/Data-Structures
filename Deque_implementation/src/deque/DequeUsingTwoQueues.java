package deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class DequeUsingTwoQueues {
    private Queue<Integer> frontQueue;
    private Queue<Integer> rearQueue;

    public DequeUsingTwoQueues() {
        frontQueue = new LinkedList<>();
        rearQueue = new LinkedList<>();
    }

    public void addFirst(int item) {
        frontQueue.add(item);
        balanceQueues();
    }

    public void addLast(int item) {
        rearQueue.add(item);
        balanceQueues();
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Deque Underflow!!");
        }
        if (frontQueue.isEmpty()) {
            balanceQueues();
        }
        return frontQueue.poll();
    }

    public int removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Deque Underflow!!");
        }
        if (rearQueue.isEmpty()) {
            balanceQueues();
        }
        return rearQueue.poll();
    }

    public int peekFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is Empty!!");
        }
        if (frontQueue.isEmpty()) {
            balanceQueues();
        }
        return frontQueue.peek();
    }

    public int peekLast() {
        if (isEmpty()) {
            throw new RuntimeException("Deque is Empty!!");
        }
        if (rearQueue.isEmpty()) {
            balanceQueues();
        }
        return rearQueue.peek();
    }

    public boolean isEmpty() {
        return frontQueue.isEmpty() && rearQueue.isEmpty();
    }

    private void balanceQueues() {
        int totalSize = frontQueue.size() + rearQueue.size();
        int halfSize = totalSize / 2;

        if (frontQueue.size() > halfSize) {
            while (frontQueue.size() > halfSize) {
                rearQueue.add(frontQueue.poll());
            }
        } else if (rearQueue.size() > halfSize) {
            while (rearQueue.size() > halfSize) {
                frontQueue.add(rearQueue.poll());
            }
        }
    }

    public static void main(String[] args) {
        DequeUsingTwoQueues deque = new DequeUsingTwoQueues();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Remove First");
            System.out.println("4. Remove Last");
            System.out.println("5. Peek First");
            System.out.println("6. Peek Last");
            System.out.println("7. Check if Empty");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add to the front: ");
                    int numToAddFirst = scanner.nextInt();
                    deque.addFirst(numToAddFirst);
                    System.out.println(numToAddFirst + " added to the front.");
                    break;
                case 2:
                    System.out.print("Enter a number to add to the rear: ");
                    int numToAddLast = scanner.nextInt();
                    deque.addLast(numToAddLast);
                    System.out.println(numToAddLast + " added to the rear.");
                    break;
                case 3:
                    try {
                        int removedFirst = deque.removeFirst();
                        System.out.println("Removed from front: " + removedFirst);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        int removedLast = deque.removeLast();
                        System.out.println("Removed from rear: " + removedLast);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        int peekedFirst = deque.peekFirst();
                        System.out.println("First element: " + peekedFirst);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        int peekedLast = deque.peekLast();
                        System.out.println("Last element: " + peekedLast);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        System.out.println("The deque is empty.");
                    } else {
                        System.out.println("The deque is not empty.");
                    }
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
