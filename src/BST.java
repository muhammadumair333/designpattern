public class BST {

    public static void main(String[] args) {
        Trees t1 = new Trees();


        for (int i = 1; i < 12; i++) {
            t1.addNode((i * 10) - (12 % (i * 2)));
        }

        boolean value = t1.contains(t1.root, 45);
        System.out.println(" " + value);
    }
}


class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

class Trees {

    Node root;

    private void insertNode(Node current, int value) {
        if (value < current.data) {
            if (current.left == null)
                current.left = new Node(value);
            else
                insertNode(current.left, value);
        } else {
            if (current.right == null)
                current.right = new Node(value);
            else
                insertNode(current.right, value);
        }
    }

    void addNode(int value) {
        if (root == null) {
            root = new Node(value);
        } else
            insertNode(root, value);
    }

    boolean contains(Node current, int value) {
        if (current == null)
            return false;
        if (current.data == value)
            return true;
        if (value < current.data)
            contains(current.left, value);
        else
            contains(current.right, value);
        return false;
    }

    Node deleteNode(Node current , int value) {

        if(current == null) return null;
        if(value < current.data){
            current.left = deleteNode(current.left, value);
        } else if(value > current.data){
            current.right = deleteNode(current.right, value);
        } else {
            if(current.right == null &&  current.left == null)
                current = null;
            else if(root.right != null) {
                current.data = successor(current);
                current.right = deleteNode(current.right, value);
            } else {
                current.data = predecessor(current);
                current.left = deleteNode(current.left, value);
            }
        }
        return current;
    }

    private int successor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }
}

