package Datastructure.Tree;

public class Equal {
    static boolean isEqual(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        else if (node1.data == node2.data) {
            return isEqual(node1.left, node2.left) && isEqual(node1.right, node2.right);
        }else
            return false;
    }
}
