package LinkedList;

public class Node {
    private int item;
    private Node nextNode;

    public Node (int item){
        this.item=item;
    }

    public int getItem() {
        return item;
    }

    public Node getNextNode() {
        return nextNode;
    }


    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

}
