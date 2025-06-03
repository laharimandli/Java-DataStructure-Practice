import java.util.*;

public class MirrorBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    static void printLevelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println();
    }

    static Node mirror(Node root) {
        if (root == null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.right = new Node(20);

        System.out.println("Before Mirroring (Level Order):");
        printLevelOrder(root);

        mirror(root); 

        System.out.println("After Mirroring (Level Order):");
        printLevelOrder(root);
    }
}
