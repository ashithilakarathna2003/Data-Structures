package singleLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(12);
        list.add(18);
        System.out.print("This Is Initial List : ");
        list.printList();
        System.out.println();

        list.remove(12);
        System.out.print("After Removing 12: ");
        list.printList();
        System.out.println();

        list.add(20);
        System.out.print("After Adding 20: ");
        list.printList();
    }
}
