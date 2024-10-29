package Datastructure.Tree;

public class BinaryTree {
    private Node root;
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node : "+data;
        }
    }


    void add(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        }
        else {
            Node leafParent = root;
            while (!hasLeaf(leafParent)) {
                if (hasLeaf(leafParent.left)) {
                    leafParent = leafParent.left;
                }else {
                    leafParent = leafParent.right;
                }
            }
            if (leafParent.left == null) {
                leafParent.left = newNode;
            }else if (leafParent.right == null) {
                leafParent.right = newNode;
            }
        }
    }

    private boolean hasLeaf(Node root) {
        return root.left == null || root.right ==null;
    }
}
