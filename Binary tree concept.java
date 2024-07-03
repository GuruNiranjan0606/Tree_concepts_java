import java.util.*;
class Node{
    int key;
    Node left,right;
    Node(int item){
        key=item;
        left=right=null;
    }
}
class BinaryTree{
    Node root;
    public void traversetree(Node node){
        if(node!=null){
            traversetree(node.left);
            System.out.print(" "+node.key);
            traversetree(node.right);
        }
    }
    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        System.out.print("\n Binary tree: ");
        tree.traversetree(tree.root);
    }
}