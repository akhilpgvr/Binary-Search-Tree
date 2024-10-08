public class Main {
    public static void main(String[] args) {
        System.out.println("..................................");
        System.out.println("Binary Search Tree");
        System.out.println("..................................");
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        root = bst.insertChild(root, 28);
        root = bst.insertChild(root, 70);
        root = bst.insertChild(root, 13);
        root = bst.insertChild(root, 60);
        root = bst.insertChild(root, 12);
        root = bst.insertChild(root, 54);
        root = bst.insertChild(root, 98);
        root = bst.insertChild(root, 33);
        root = bst.insertChild(root, 66);
        root = bst.insertChild(root, 56);
        root = bst.insertChild(root, 15);

        System.out.println("..................................");
        System.out.println("BST Inorder Traversal");
        System.out.println("..................................");
        bst.inorderTraversal(root);
        System.out.println();
        System.out.println("..................................");

        System.out.println("..................................");
        System.out.println("Search BST");
        System.out.println("..................................");
        bst.searchBST(root, 15);
        bst.searchBST(root, 99);
        System.out.println("..................................");
    }
}