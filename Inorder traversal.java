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
    public void inorder (TreeNode node){
        if(node==null){
            return;
        }

        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        TreeTraversal tree=new TreeTraversal();
        System.out.println("Inorder Traversal : ");
        tree.inorder(root);
    }
}