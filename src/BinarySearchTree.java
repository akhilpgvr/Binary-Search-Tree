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

    public void inorderTraversal(Node root) {

        //if node is null--> p
        if(root == null) return;
        //make recursion to perform inorder traversal in left subtree
        inorderTraversal(root.leftChild);
        System.out.print(" "+root.data+ " ");
        //make recursion to perform inorder traversal in left subtree
        inorderTraversal(root.rightChild);
    }

    public void searchBST(Node root, int key) {

        //checking tree reach its last node--> if true: display element not found
        if(root == null) {
            System.out.println("Element "+key+" Not Found");
        }
        //checking node data is key--> if true: display element found
        else if(root.data == key) {
            System.out.println("Element "+key+ " found");
        }
        //if node data> key--> do search in left subtree
        else if(root.data>key) searchBST(root.leftChild, key);
        //node data<key--> do search in right subtree
        else searchBST(root.rightChild, key);
    }
}
