package Datastructure.Tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binaryTree = new BinarySearchTree();
        binaryTree.add(7);
        binaryTree.add(4);
        binaryTree.add(9);
        binaryTree.add(1);
        binaryTree.add(6);
        binaryTree.add(8);
        binaryTree.add(10);
        System.out.println(binaryTree.hasItem(0));
        System.out.println(binaryTree.hasItem(7));

        DFS dfs = new DFS();
        dfs.preOrder(binaryTree.getRootNode());
        System.out.println();
        dfs.inOrder(binaryTree.getRootNode());
        System.out.println();
        dfs.postOrder(binaryTree.getRootNode());
    }
}
