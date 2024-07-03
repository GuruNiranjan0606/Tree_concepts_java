import java.util.*;
class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}
class TreeTraversal{
public void preorder (TreeNode node){
    if(node==null){
        return;
    }
    System.out.print(node.value+" ");
    preorder(node.left);
    preorder(node.right);
}
public static void main(String[] args){
    TreeNode root=new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.left=new TreeNode(4);
    root.left.right=new TreeNode(5);
    TreeTraversal tree=new TreeTraversal();
    System.out.println("preorder Traversal : ");
    tree.preorder(root);
}
}