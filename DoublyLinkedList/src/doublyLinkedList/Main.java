package doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(12);
        list.add(15);
        System.out.print("This Is Initial List : ");
        list.printList();
        System.out.println();

        list.remove(12);
        System.out.print("After Removing 12 : ");
        list.printList();
        System.out.println();

        list.add(24);
        System.out.print("After Adding 24 : ");
        list.printList();
        System.out.println();

        System.out.print("List in Reverse : ");
        list.printListReverse();
    }
}
