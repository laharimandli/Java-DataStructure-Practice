class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class CountLeafNodes{
    public static int countLeafNodes(TreeNode node) {
    if (node == null)
        return 0;                
    if (node.left == null && node.right == null)
        return 1;                 
    return countLeafNodes(node.left) + countLeafNodes(node.right);
}


    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Number of nodes in the tree: " +countLeafNodes(root));
    }
}
