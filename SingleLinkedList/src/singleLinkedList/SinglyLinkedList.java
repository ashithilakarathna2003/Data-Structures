package singleLinkedList;

public class SinglyLinkedList {
 private Node head;

 public SinglyLinkedList() {
     this.head = null;
 }

 public void add(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
     } else {
         Node current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = newNode;
     }
 }

 public void remove(int data) {
     if (head == null) {
         return;
     }

     if (head.data == data) {
         head = head.next;
         return;
     }

     Node current = head;
     while (current.next != null && current.next.data != data) {
         current = current.next;
     }

     if (current.next != null) {
         current.next = current.next.next;
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
}
