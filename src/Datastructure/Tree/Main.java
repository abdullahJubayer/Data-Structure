package Datastructure.Tree;

public class Main {
    public static void main(String[] args) {
        BinaryBalancedTree binaryTree = new BinaryBalancedTree();
        binaryTree.add(7);
        binaryTree.add(4);
        binaryTree.add(9);
        binaryTree.add(1);
        binaryTree.add(6);
        binaryTree.add(8);
        binaryTree.add(10);

        BinaryBalancedTree binaryTree2 = new BinaryBalancedTree();
        binaryTree2.add(7);
        binaryTree2.add(4);
        binaryTree2.add(9);
        binaryTree2.add(1);
        binaryTree2.add(6);
        binaryTree2.add(8);
        binaryTree2.add(10);

        BinarySearchTree searchTree = new BinarySearchTree();
        searchTree.add(20);
        searchTree.add(10);
        searchTree.add(30);
        searchTree.add(6);
        searchTree.add(11);

        System.out.println("hasItem : "+binaryTree.hasItem(0));
        System.out.println("hasItem : "+binaryTree.hasItem(6));
        System.out.println("Height : " + binaryTree.height());
        System.out.println("Max Val : " + binaryTree.max());
        System.out.println("Min Val : " + binaryTree.min());
        System.out.println("isEqual : " + binaryTree.isEqual(null));
        System.out.println("isEqual : " + Equal.isEqual(binaryTree.getRootNode(), binaryTree2.getRootNode()));
        System.out.println("isBinarySearchTree : " + searchTree.isBinarySearchTree());

        DFS dfs = new DFS();
        dfs.preOrder(binaryTree.getRootNode());
        System.out.println();
        dfs.inOrder(binaryTree.getRootNode());
        System.out.println();
        dfs.postOrder(binaryTree.getRootNode());
    }
}
