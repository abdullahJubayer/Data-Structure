package Datastructure.Tree;

public class DFS {

    /*
     * Root,Left,Right
     *
     * Time Complexity of this method is O(n)
     * Because the worst case Scenario is, when array.length == currentItemPos
     * Then we need to do 2 thins, 1.Increase the size of array 2.Copy Previous Item to new Datastructure.Array
     * So we need Double work hare
     * */
    void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}

/*
 *           7
 *          /\
 *         /  \
 *        /    \
 *       /      \
 *      9        4
 *     /\        /\
 *    /  \      /  \
 *   10   8    6    1
 *
 * ----------------------
 * |                    |
 * |    Execution       |
 * |                    |
 * ----------------------
 *
 * preOrder(root) == preOrder(7)
 *      |
 *      root != null == true
 *      print(7)
 *      preOrder(root.left) == preOrder(9)
 *          |
 *          root != null == true
 *          print(9)
 *          preOrder(root.left) == preOrder(10)
 *              |
 *              root != null == true
 *              print(10)
 *              preOrder(root.left) == preOrder(null)
 *                  |
 *                  root != null == false
 *              preOrder(root.right) == preOrder(null)
 *                  |
 *                  root != null == false
 *          preOrder(root.right) == preOrder(8)
 *              |
 *              root != null == true
 *              print(8)
 *              preOrder(root.left) == preOrder(null)
 *                  |
 *                  root != null == false
 *              preOrder(root.right) == preOrder(null)
 *                  |
 *                  root != null == false
 *
 *
 *
 *      preOrder(root.right) == preOrder(4)
 *          |
 *          root != null == true
 *          print(4)
 *          preOrder(root.left) == preOrder(6)
 *              |
 *              root != null == true
 *              print(6)
 *              preOrder(root.left) == preOrder(null)
 *                  |
 *                  root != null == false
 *              preOrder(root.right) == preOrder(null)
 *                  |
 *                  root != null == false
 *          preOrder(root.right) == preOrder(1)
 *              |
 *              root != null == true
 *              print(1)
 *              preOrder(root.left) == preOrder(null)
 *                  |
 *                  root != null == false
 *              preOrder(root.right) == preOrder(null)
 *                  |
 *                  root != null == false
 *
 */
