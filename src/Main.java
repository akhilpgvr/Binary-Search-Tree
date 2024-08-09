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
    }
}