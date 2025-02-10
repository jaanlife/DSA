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

    // Iterative insert function
    public void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (key < current.key) {
                current = current.left;
            } else if (key > current.key) {
                current = current.right;
            } else {
                return; // Duplicate keys are not allowed
            }
        }

        if (key < parent.key) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    // Iterative search function
    public boolean search(int key) {
        Node current = root;

        while (current != null) {
            if (key == current.key) {
                return true; // Found the key
            } else if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false; // Key not found
    }

    // Iterative delete function
    public void delete(int key) {
        Node parent = null;
        Node current = root;

        while (current != null && current.key != key) {
            parent = current;
            if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Key not found");
            return;
        }

        // Case 1: Node has no child (Leaf node)
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (parent.left == current) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // Case 2: Node has one child
        else if (current.left == null) { // Only right child
            if (current == root) {
                root = current.right;
            } else if (parent.left == current) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.right == null) { // Only left child
            if (current == root) {
                root = current.left;
            } else if (parent.left == current) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
        // Case 3: Node has two children
        else {
            Node successor = findMin(current.right);
            int successorKey = successor.key;
            delete(successorKey); // Delete successor
            current.key = successorKey; // Replace with successor key
        }
    }

    // Helper function to find the minimum node in a subtree
    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // In-order traversal (iterative)
    public void inorder() {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.key + " ");
            current = current.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BST tree = new BST();
        
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
