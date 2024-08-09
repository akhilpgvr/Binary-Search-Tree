import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public Node insertChild(Node root, int data) {

        //checking value is empty, if empty--> create a node and insert data
        if(root == null) return new Node(data);

        //if data is already present -- return data
        if(root.data == data) return root;

        //check node.data is greater than data-to-insert, if less--> assign it to leftChild by assigning recursion call
        else if(root.data>data) root.leftChild = insertChild(root.leftChild, data);

        //node.data is lesser than data-to-insert, assign it to rightChild by assigning recursion call
        else root.rightChild = insertChild(root.rightChild, data);

        return root;
    }
}
