package Datastructure.Tree;

public class BinarySearchTree {
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
