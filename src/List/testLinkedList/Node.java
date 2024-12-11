package List.testLinkedList;

public class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }
    public String toString(){
        return "Node name = " + item;
    }
}
