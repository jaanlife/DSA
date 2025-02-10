class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

class BST {
    private Node root;

    public BST() {
        root = null;
    }

    // Recursive insert function
    private Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive search function
    private boolean searchRec(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }

        return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    // Recursive delete function
    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // Node with one child or no child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Node with two children: Get inorder successor (smallest in right subtree)
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    // Helper function to find the minimum value node in a subtree
    private int minValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.key;
    }

    // Recursive in-order traversal
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    public static void main(String[] args) {
        BST tree = new BST();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorder();  // Output: 20 30 40 50 60 70 80

        System.out.println("Search 40: " + tree.search(40)); // Output: true
        System.out.println("Search 100: " + tree.search(100)); // Output: false

        tree.delete(30);
        System.out.println("Inorder after deleting 30:");
        tree.inorder();  // Output: 20 40 50 60 70 80
    }
}
