package LinkedListImpl;

public class LinkedListImpl {
    public Node head;

    public LinkedListImpl() {}

    public LinkedListImpl(Node head) {
        this.head = head;
    }

    public boolean addFirst(Node node) {
        if(head == null) {
            head = node;
            return true;
        }

        node.next = head;
        head = node;
        return true;
    }
}
