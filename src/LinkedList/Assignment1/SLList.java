package LinkedList.Assignment1;

import java.util.NoSuchElementException;

/*Data Structures and Algorithm by Adam Drozdek */
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
      out.print(tmp.info);
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

    if (head == null)
      head = newNode;
    else {
      SLLNode current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public Object getFirst() { // ! done
    if (head == null)
      throw new NoSuchElementException();
    return head.info;
  }

  public Object getLast() {
    if (head == null)
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
    SLLNode current = head;

    if (current == null || current.next == null) {
      head = null;
      return new NoSuchElementException();
    }

    SLLNode nextNode = current.next;
    while (current.next != null) {
      if (nextNode.next == null)
        current.next = null;
      current = nextNode;
      nextNode = current.next;
    }
    return current;
  }

  public void deleteAll(Object ob) {
    if (head != null) {
      // if nonempty list;
      if (ob.equals(head.info)) // if head needs to be removed;
        head = head.next;
      else {
        SLLNode pred = head, tmp = head.next;
        for (; tmp != null && !(tmp.info.equals(ob)); pred = pred.next, tmp = tmp.next)
          ;
        if (tmp != null) // if found
          pred.next = tmp.next;
      }
    }
  }

  public int size() {
    SLLNode current = head;
    int size = 0;
    if (current == null || current.next == null)
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
}

/*
 * todo void deleteAll(Object ob) Remove all occurrence of ob in the linked list
 * throw NoSuchElementException if the linked list is empty
 * 
 * todo int lastIndexOf(Object ob) Return the position of the last occurrence of
 * object ob in the linked list and return –1 if ob is not found
 * 
 * todo int firstIndexOf(Object ob) Return the position of the first occurrence
 * of object ob in the linked list and return –1 if obis not found
 */