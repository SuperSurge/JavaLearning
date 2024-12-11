package List.testLinkedList;

public class Test {
    public static void main(String[] args) {
        Node n1 = new Node(111);
        Node n2 = new Node(222);
        Node n3 = new Node(333);
        n1.next = n2;

        n2.pre = n1;
        n2.next = n3;

        n3.pre = n2;

        Node first = n1;
        Node last = n3;

        while(first != null)
        {
            System.out.println(first.item);
            first = first.next;
        }
    }
}
