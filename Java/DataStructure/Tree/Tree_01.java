package DataStructure.Tree;

class tree_node {
    int value;
    tree_node left;
    tree_node right;

    public tree_node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class tree {
    private tree_node root;

    public tree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRecurrsive(root, value);
    }

    public tree_node insertRecurrsive(tree_node current, int value) {
        if (current == null) {
            return new tree_node(value);
        }
        if (value < current.value) {
            current.left = insertRecurrsive(current.left, value);
        } else if (value >= current.value) {
            current.right = insertRecurrsive(current.right, value);
        }
        return current;
    }

    public void inOrderTraversal() {
        System.out.print("In-order Traversal: ");
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(tree_node current) {
        if (current != null) {
            inOrderRecursive(current.left);
            System.out.print(current.value + " ");
            inOrderRecursive(current.right);
        }
    }
}

public class Tree_01 {
    public static void main(String[] args) {
        tree bst = new tree();

        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(5);
        bst.insert(15);
        bst.insert(25);
        bst.insert(35);
        bst.insert(12);

        bst.inOrderTraversal();
    }
}