package Datastructure.Tree;

public class BinarySearchTree {
    private Node rootNode;

    void add(int item){
        Node newNode = new Node(item);
        if (rootNode == null){
            rootNode  = newNode;
        }else {
            Node currentRoot = rootNode;
            while (true) {
                if(item  < currentRoot.data){
                    if (currentRoot.left == null){
                        currentRoot.left = newNode;
                        break;
                    }else if (currentRoot.right == null){
                        currentRoot.right = newNode;
                        break;
                    }else {
                        currentRoot = currentRoot.left;
                    }
                }else {
                    if (currentRoot.left == null){
                        currentRoot.left = newNode;
                        break;
                    }
                    else if (currentRoot.right == null){
                        currentRoot.right = newNode;
                        break;
                    }else {
                        currentRoot = currentRoot.right;
                    }
                }
            }
        }
    }


    boolean isBinarySearchTree() {
        return isBinarySearchTree(rootNode);
    }

    private boolean isBinarySearchTree(Node root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return ((root.left != null && root.left.data < root.data) && (isBinarySearchTree(root.left))) && ((root.right != null && root.right.data > root.data) && (isBinarySearchTree(root.right)));
    }

    private boolean isBinarySearchTree(Node root, int minValue, int maxValue) {
            isBinarySearchTree(root.left,minValue,root.data);
            isBinarySearchTree(root.right,root.data,maxValue);
        return false;
    }
}
