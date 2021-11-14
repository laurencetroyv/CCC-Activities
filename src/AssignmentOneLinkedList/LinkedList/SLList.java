package AssignmentOneLinkedList.LinkedList;

import java.util.NoSuchElementException;

public class SLList {

    protected SLLNode head = null;

    public SLList() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Object first() {
        return head.info;
    }

    public void printAll(java.io.PrintStream out) {
        for (SLLNode tmp = head; tmp != null; tmp = tmp.next)
            out.print(tmp.info + " ");
    }

    public void addFirst(Object el) {
        head = new SLLNode(el, head);
    }

    public Object find(Object el) {
        SLLNode tmp = head;
        for (; tmp != null && !el.equals(tmp.info); tmp = tmp.next)
            ;
        if (tmp == null)
            return null;
        else
            return tmp.info;
    }

    public Object deleteFirst() { // remove the head and return its info;
        Object el = head.info;
        head = head.next;
        return el;
    }

    public void delete(Object el) { // find and remove el;
        if (head != null) // if nonempty list;
            if (el.equals(head.info)) // if head needs to be removed;
                head = head.next;
            else {
                SLLNode pred = head, tmp = head.next;
                for (; tmp != null && !(tmp.info.equals(el)); pred = pred.next, tmp = tmp.next)
                    ;
                if (tmp != null) // if found
                    pred.next = tmp.next;
            }
    }

    public void addLast(Object el) {
        SLLNode newNode = new SLLNode(el);

        if (isEmpty())
            head = newNode;
        else {
            SLLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Object getFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        return first();
    }

    public Object getLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            SLLNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            return current.info;
        }
    }

    public Object deleteLast() {
        SLLNode deleted;
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            SLLNode current = head;
            SLLNode nextNode = current.next;

            while (true) {
                if (nextNode.next == null) {
                    deleted = nextNode;
                    current.next = null;
                    break;
                }
                current = nextNode;
                nextNode = current.next;
            }
            return deleted.info;
        }
    }

    public void deleteAll(Object ob) {
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            SLLNode current = head;
            SLLNode nextNode = current.next;
            int index = 1;
            boolean condition = true;
            while (condition) {
                if (index == size()) {
                    condition = false;
                }
                if (nextNode.equals(ob))
                    nextNode = current.next;

                current = nextNode;
                nextNode = nextNode.next;
                index++;
            }
        }
    }

    public int size() {
        SLLNode current = head;
        int size = 0;
        if (isEmpty())
            return size;

        SLLNode nextNode = current.next;
        size++;

        while (current.next != null) {
            if (nextNode == null)
                current.next = null;

            current = nextNode;
            size++;
            nextNode = nextNode.next;
        }
        return size;
    }

    public int lastIndexOf(Object ob) {
        int index = 0;

        SLLNode current = head;
        SLLNode nextNode = current.next;

        if (isEmpty())
            return index;

        while (current.next != null) {
            if (nextNode.equals(ob))
                index = 0;

            current = nextNode;
            index++;
            nextNode = nextNode.next;
        }
        return index;
    }

    public int firstIndexOf(Object ob) {
        int index = 0;

        SLLNode temporary = head;
        for (; temporary != null && !ob.equals(temporary.info); temporary = temporary.next) {
            index++;
        }
        if (temporary == null)
            return -1;
        else
            return index;
    }
}
