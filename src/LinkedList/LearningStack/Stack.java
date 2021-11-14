package LinkedList.LearningStack;

import java.util.EmptyStackException;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.setSize(0);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
        setSize(getSize() + 1);
    }

    public int pop() {
        if (!isEmpty()) {
            int temp = top.data;
            top = top.next;
            setSize(getSize() - 1);
            return temp;
        }
        throw new EmptyStackException();
    }
    
    public int peek() {
        if(top == null)
            throw new EmptyStackException();
        return top.data;
    }
    
    private boolean isEmpty() {
        return top == null;
    }

}
