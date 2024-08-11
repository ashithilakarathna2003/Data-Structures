package binaryTree;

public class MainClass {
    public static void main(String[] args) {
        BinaryClass tree = new BinaryClass();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("\n\nPreorder traversal:");
        tree.preorder();

        System.out.println("\n\nPostorder traversal:");
        tree.postorder();

        System.out.println("\n\nDelete 20:");
        tree.delete(20);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();

        System.out.println("\n\nDelete 30:");
        tree.delete(30);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();

        System.out.println("\n\nDelete 50:");
        tree.delete(50);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();
    }
}
