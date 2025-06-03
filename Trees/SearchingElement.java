import java.util.*;

public class SearchingElement {
    
    static class Node {
        int data;
        Node left, right;
        
        Node(int value) {
            data = value;
            left = right = null;
        }
    }

   
    static boolean searchElement(Node root, int key) {
        if (root == null) return false;

        if (root.data == key)
            return true;

        return searchElement(root.left, key) || searchElement(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.right = new Node(20);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        if (searchElement(root, key)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
