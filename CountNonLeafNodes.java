import java.util.*;
public class CountNonLeafNodes{
static class Node{
int data;
Node left,right;
Node(int value){
data=value;
left=right=null;
}
}

static int countNonLeafNodes(Node root){
if(root==null) return 0;
if(root.left==null && root.right==null) return 0;
return 1+countNonLeafNodes(root.left)+countNonLeafNodes(root.right);
}

public static void main(String args[]){
Node root=new Node(10);
root.left=new Node(6);
root.right=new Node(15);
root.left.left=new Node(4);
root.left.right=new Node(8);
root.right.right=new Node(20);
System.out.println("Nonleaf nodes count:"+countNonLeafNodes(root));
}
}