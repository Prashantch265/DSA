package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BST {
    class Node{
        int key;
        Node left, right;
        public Node(int key){
            this.key = key;
            left = null;
            right = null;
        }
    }

    Node root, tmp;

    public BST(){
        root = null;
    }

    void insert(int key)
    {
        root = recursion(root, key);
    }

    Node recursion(Node root, int key)
    {

        /* If the tree is empty,
           return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = recursion(root.left, key);
        else if (key > root.key)
            root.right = recursion(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    void delete(int key){
        root = deleteNode(root, key);
    }

    Node deleteNode(Node root, int key){
        if(root == null){
            return root;
        }

        if(key < root.key)
            root.left = deleteNode(root.left, key);
        else if(key > root.key)
            root.right = deleteNode(root.right, key);
        else{
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root){
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    void inorder()
    {
        inorderTraverse(root);
    }

    void inorderTraverse(Node root)
    {
        if (root != null) {
            inorderTraverse(root.left);
            System.out.println(root.key);
            inorderTraverse(root.right);
        }
    }

    void preorder(){
        preorderTraverse(root);
    }

    void preorderTraverse(Node root){
        if(root!=null){
            System.out.println(root.key);
            preorderTraverse(root.left);
            preorderTraverse(root.right);
        }
    }

    void postorder(){
        postorderTraverse(root);
    }

    void postorderTraverse(Node root){
        if(root != null){
            postorderTraverse(root.left);
            postorderTraverse(root.right);
            System.out.println(root.key);
        }
    }

    void search(int item){
        System.out.print( searchElement(root, item).key);
    }

    Node searchElement(Node tmp, int key){
        while (tmp != null) {
            if (key == tmp.key)
                return tmp;
            else if (key < tmp.key)
                tmp = tmp.left;
            else
                tmp = tmp.right;
        }
        return null;
    }

    public void breadthFirst(){
        Queue<Node> obj = new LinkedList<Node>();
        obj.add(root);
        while (!obj.isEmpty())
        {

            // poll() removes the present head.
            Node tempNode = obj.poll();
            System.out.print(tempNode.key + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                obj.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                obj.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args)
    {
        BST obj = new BST();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        obj.insert(50);
        obj.insert(30);
        obj.insert(20);
        obj.insert(40);
        obj.insert(70);
        obj.insert(60);
        obj.insert(80);

        Scanner sc = new Scanner(System.in);

        System.out.println(" 1. Insert Node\n " +
                "2. Delete Node\n " +
                "3. Search Node\n " +
                "4. BFS traversal\n " +
                "5. Inorder traversal\n " +
                "6. Postorder traversal\n " +
                "7. Preorder traversal");

        System.out.println("Choose the given option:");
//        int n = sc.nextInt();
//        switch (n){
//            case 1:
//        }
        System.out.println("Inorder Traversal");
        obj.inorder();

        obj.search(60);

        obj.breadthFirst();

        obj.delete(40);

        obj.inorder();
    }
}
