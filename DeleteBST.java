import java.util.*;
public class DeleteBST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left = insert(root.left, val);
        }
        else{
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node Delete(Node root,int val){
        if(root.data<val){
            root.right = Delete(root.right, val);
        }
        else if(root.data>val){
            root.left = Delete(root.left, val);
        }
        else{
            if(root.left==null&&root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            Node is = findInordersuccessor(root.right);
            root.data = is.data;
            root.right = Delete(root.right,is.data);
            return root;
        }
    }
    public static Node findInordersuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static void main(String args[]){
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
        root = Delete(root,1);
        System.out.println();
        inorder(root);
    }
}
