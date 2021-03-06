package binaryTree;

/************************* BSTNode.java **************************
 *          node of a generic binary search tree                 *
 *********************** BSTNode.java ***************************/
public class BSTNode {
    protected Comparable<Object> element;
    protected BSTNode left;
    protected BSTNode right;

    public BSTNode() {
        left = right = null;
    }

    public BSTNode(Comparable element) {
        this(element, null, null);
    }

    public BSTNode(Comparable element, BSTNode left, BSTNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
}