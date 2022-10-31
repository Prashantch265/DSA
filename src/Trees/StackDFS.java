package Trees;

import java.util.Stack;

public class StackDFS {
    class Node{
        int key;
        Node left, right;
        public Node(int key){
            this.key = key;
            left = null;
            right = null;
        }
    }

    Node root,tmp;

    public StackDFS(){
        root = null;
    }

    Node insert(Node root, int key){
        Node newNode = new Node(key);

        tmp = root;

        while (tmp != null) {
            if (key < tmp.key)
                tmp = tmp.left;
            else
                tmp = tmp.right;
        }
            // The new node is the root node
            if (tmp == null)
                tmp = newNode;

                // If the new key is less then the leaf node key
                // Assign the new node to be its left child
            else if (key < tmp.key)
                tmp.left = newNode;

                // else assign the new node its right child
            else
                tmp.right = newNode;

            // Returns the pointer where the
            // new node is inserted
            return tmp;
    }

    public void preorder(){
        Stack obj = new Stack();
        tmp = root;
        if(tmp != null){
            obj.push(tmp);
            while(!obj.isEmpty()){
                tmp = (Node)obj.pop();
            }
        }
    }

    public static void main(String[] args){
        StackDFS obj = new StackDFS();
        Node root = null;
        obj.insert(root, 50);
        obj.insert(root, 30);
        obj.insert(root, 20);
        obj.insert(root, 40);
        obj.insert(root,70);
        obj.insert(root,60);
        obj.insert(root,80);
    }
}
