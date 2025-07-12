package DataStructure.Sorting;
class Node {
    int data;
    String color;
    Node left, right, parent;

    public Node(int data) {
        this.data = data;
        this.color = "RED";
        this.left = this.right = this.parent = null;
    }
}

public class RedBlackTree {
    private Node root;
    private Node TNULL;

    public RedBlackTree() {
        TNULL = new Node(0);
        TNULL.color = "BLACK";
        root = TNULL;
    }

    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != TNULL) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    private void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != TNULL) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == null) {
            root = y;
        } else if (x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    private void fixInsert(Node k) {
        Node u;
        while (k.parent.color.equals("RED")) {
            if (k.parent == k.parent.parent.left) {
                u = k.parent.parent.right;
                if (u.color.equals("RED")) {
                    k.parent.color = "BLACK";
                    u.color = "BLACK";
                    k.parent.parent.color = "RED";
                    k = k.parent.parent;
                } else {
                    if (k == k.parent.right) {
                        k = k.parent;
                        leftRotate(k);
                    }
                    k.parent.color = "BLACK";
                    k.parent.parent.color = "RED";
                    rightRotate(k.parent.parent);
                }
            } else {
                u = k.parent.parent.left;
                if (u.color.equals("RED")) {
                    k.parent.color = "BLACK";
                    u.color = "BLACK";
                    k.parent.parent.color = "RED";
                    k = k.parent.parent;
                } else {
                    if (k == k.parent.left) {
                        k = k.parent;
                        rightRotate(k);
                    }
                    k.parent.color = "BLACK";
                    k.parent.parent.color = "RED";
                    leftRotate(k.parent.parent);
                }
            }
            if (k == root) {
                break;
            }
        }
        root.color = "BLACK";
    }

    public void insert(int key) {
        Node node = new Node(key);
        node.parent = null;
        node.left = TNULL;
        node.right = TNULL;

        Node y = null;
        Node x = this.root;

        while (x != TNULL) {
            y = x;
            if (node.data < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        node.parent = y;
        if (y == null) {
            root = node;
        } else if (node.data < y.data) {
            y.left = node;
        } else {
            y.right = node;
        }

        if (node.parent == null) {
            node.color = "BLACK";
            return;
        }

        if (node.parent.parent == null) {
            return;
        }

        fixInsert(node);
    }

    public void preOrder() {
        preOrderHelper(this.root);
    }

    private void preOrderHelper(Node node) {
        if (node != TNULL) {
            System.out.print(node.data + " ");
            preOrderHelper(node.left);
            preOrderHelper(node.right);
        }
    }

    public static void main(String[] args) {
        RedBlackTree bst = new RedBlackTree();
        bst.insert(20);
        bst.insert(15);
        bst.insert(25);
        bst.insert(10);
        bst.insert(5);
        bst.insert(30);

        System.out.println("Preorder Traversal of the Red-Black Tree:");
        bst.preOrder();
    }
}
