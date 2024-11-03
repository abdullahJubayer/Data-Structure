package Datastructure.Tree;

public class BinaryBalancedTree {
    private Node rootNode;
    public Node getRootNode() {
        return rootNode;
    }

    /* Time Complexity of this method is O(LogN)
     * Because this tree is balanced tree and every time it cut of it's left side or right side to find exact position.
     * */
    void add(int item){
        Node newNode = new Node(item);
        if (rootNode == null){
            rootNode  = newNode;
        }else {
            Node currentRoot = rootNode;
            while (true) {
                if(item  > currentRoot.data){
                   if (currentRoot.left == null){
                       currentRoot.left = newNode;
                       break;
                   }else {
                       currentRoot = currentRoot.left;
                   }
                }else {
                    if (currentRoot.right == null){
                        currentRoot.right = newNode;
                        break;
                    }else {
                        currentRoot = currentRoot.right;
                    }
                }
            }
        }
    }

    /* Space Complexity of this array is O(1)
     * Because if tree has size of n data. it only uses the memory of one object
     */

    /* Time Complexity of this method is O(LogN)
     * Because this tree is balanced tree and every time tree cut of it's left side or right side.
     * */
    boolean hasItem(int item){
        Node currentRoot = rootNode;
        while(currentRoot != null){
            if (item > currentRoot.data){
                currentRoot = currentRoot.left;
            }else if (item < currentRoot.data){
                currentRoot = currentRoot.right;
            }else {
                return true;
            }
        }
        return false;
    }

    int height(){
        return height(rootNode);
    }

    private int height(Node root){
        if (root == null){
            return -1;
        }
        if (root.left == null && root.right == null){
            return 0;
        }
        return  1 + Math.max(height(root.left), height(root.right));
    }

    int min(){
        return minNode(rootNode);
    }

    int max(){
        return maxNode(rootNode);
    }

    private int minNode(Node root){
        if (isLeaf(root)){
            return root.data;
        }
        return Math.min(root.data,Math.min(minNode(root.left), minNode(root.right)));
    }

    private int maxNode(Node root){
        if (isLeaf(root)){
            return root.data;
        }
        return Math.max(root.data,Math.max(maxNode(root.left), maxNode(root.right)));
    }

    private boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
}


/*
 * Final output
 *
 *           7
 *          /\
 *         /  \
 *        /    \
 *       /      \
 *      9        4
 *     /\        /\
 *    /  \      /  \
 *   10   8    6    1
 */
