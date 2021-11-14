package LinkedList.LearningSinglyLinkedList;

public class LinkedList {
    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    void addToEnd(int data) {
        Node n = new Node(data);

        if (head == null)
            head = n;
        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
        }
    }

    void addToStart(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void addAfter(int insertAfter, int data) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == insertAfter) {
                Node n = new Node(data);
                n.next = curr.next;
                curr.next = n;
                break;
            }
            curr = curr.next;
        }
    }

    Node deleteLast() {
        Node curr = head;
        if (curr == null || curr.next == null) {
            head = null;
            return curr;
        }
        Node nextNode = curr.next;
        while (curr.next != null) {
            if (nextNode.next == null)
                curr.next = null;
            curr = nextNode;
            nextNode = nextNode.next;
        }
        return curr;
    }

    Node deleteStart() {
        if (head != null) {
            Node toDelete = head;
            head = head.next;
            return toDelete;
        }
        return null;
    }

    Node deleteAfter(int data) {
        Node curr = head;
        Node toDelete = null;
        while (curr != null) {
            if (curr.data == data && curr.next != null) {
                toDelete = curr.next;
                curr.next = toDelete.next;
                break;
            }
            curr = curr.next;
        }
        return toDelete;
    }
}
