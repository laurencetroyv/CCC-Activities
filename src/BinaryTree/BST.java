package binaryTree;

/************************** BST.java **************************
 *              generic binary search tree                    *
 ************************* BST.java **************************/

public class BST {
    protected BSTNode root = null;

    public BST() {
        // empty constructor
    }

    public Comparable<Object> search(Comparable<Object> element) {
        return search(root, element);
    }

    protected Comparable<Object> search(BSTNode BSTNODEElement, Comparable<Object> element) {
        while (BSTNODEElement != null)
            if (element.equals(BSTNODEElement.element))
                return BSTNODEElement.element;
            else if (element.compareTo(BSTNODEElement.element) < 0)
            BSTNODEElement = BSTNODEElement.left;
            else
            BSTNODEElement = BSTNODEElement.right;
        return null;
    }

    public void insert(Comparable<Object> element) {
        BSTNode node = root;
        BSTNode prev = null;
        while (node != null) {
            prev = node;
            if (node.element.compareTo(element) < 0)
                node = node.right;
            else
                node = node.left;
        }
        if (root == null)
            root = new BSTNode(element);
        else if (prev.element.compareTo(element) < 0)
            prev.right = new BSTNode(element);
        else
            prev.left = new BSTNode(element);
    }

    protected void visit(BSTNode p) {
        System.out.print(p.element + " ");
    }

    public void inorder() {
        inorder(root);
    }

    protected void inorder(BSTNode p) {
        if (p != null) {
            inorder(p.left);
            visit(p);
            inorder(p.right);
        }
    }

    public int countNodes(BSTNode node) {

        if (node == null)
            return 0;

        int count = 0;
        if (node.left != null || node.right != null)
            count++;

        count += (countNodes(node.left) + countNodes(node.right));
        return count;
    }

    public int countLeaves(BSTNode node) {
        if (node == null)
            return 0;
            
        if (node.left == null && node.right == null)
            return 1;
        else
            return countLeaves(node.left) + countLeaves(node.right);
    }

    public int rightChildren(BSTNode node) {
        if (node == null)
            return 0;

        int count = 0;
        if (node.left != null || node.right != null)
            count++;

        count += (countNodes(node.right) + countNodes(node.right));
        return count;
    }

    public int height(BSTNode node) {
        if (node == null)
            return 0;
        else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }

    public BSTNode deleteAll(BSTNode node) {
        if (node == null || node.left == null && node.right == null)
            return null;

        node.left = deleteAll(node.left);
        node.right = deleteAll(node.right);

        return node;
    }
}