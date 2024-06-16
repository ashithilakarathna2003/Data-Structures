package doublyLinkedList;

//Node class representing each element in the doubly linked list
class Node {
 int data;
 Node next;
 Node prev;

 // Constructor to create a new node
 Node(int data) {
     this.data = data;
     this.next = null;
     this.prev = null;
 }
}
