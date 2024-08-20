
public class BST {

    public static void main(String[] args) {

    }

    class TreeNode {

        int key;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.key = data;
            this.left = null;
            this.right = null;
        }
    }

    public class BinarySearchTree {

        TreeNode root;

        public BinarySearchTree() {
            root = null;
        }

        void insert(int data, int key) {
            root = insertRecord(root, key);
        }
    }

    public TreeNode insertRecord(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        
        if (key < root.key) {
            root.left = insertRecord(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecord(root.right, key);
        }
        return root;
    }
}
