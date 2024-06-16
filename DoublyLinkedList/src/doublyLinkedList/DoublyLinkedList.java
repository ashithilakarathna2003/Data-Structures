package doublyLinkedList;

public class DoublyLinkedList {
 private Node head;
 private Node tail;

 public DoublyLinkedList() {
     this.head = null;
     this.tail = null;
 }

 public void add(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
         tail = newNode;
     } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
     }
 }

 public void remove(int data) {
     Node current = head;
     
     while (current != null && current.data != data) {
         current = current.next;
     }

     if (current == null) { 
         return;
     }

     if (current.prev != null) {
         current.prev.next = current.next;
     } else {
         head = current.next;
     }

     if (current.next != null) {
         current.next.prev = current.prev;
     } else {
         tail = current.prev;
     }
 }

 public void printList() {
     Node current = head;
     while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;
     }
     System.out.println();
 }

 public void printListReverse() {
     Node current = tail;
     while (current != null) {
         System.out.print(current.data + " ");
         current = current.prev;
     }
     System.out.println();
 }
}
