package binaryTree;

public class TestDriver {

    /************************* TestDriver.java **************************
    *          a test drive class for binary search tree                *
    *           Created by: Laurence Troy Sambaan Valdez                *
    ************************* TestDriver.java **************************/
    public static void main(String[] args) {

        BSTNode left = new BSTNode(40);
        BSTNode right = new BSTNode(45);
        BSTNode node = new BSTNode(50, left, right);
        
        BST bst = new BST();

        //root
        bst.root = node;

        left.right = new BSTNode(25);
        left.left = new BSTNode(10);
        left.left.left = new BSTNode(15);
        
        right.left = new BSTNode(5);
        right.right = new BSTNode(3);

        System.out.print("All Data in the Nodes: ");
        bst.inorder();

        System.out.println("\nCount all nodes in the Binary Search Tree: " + bst.countNodes(node));

        System.out.println("Count all right nodes in the Binary Search Tree: " + bst.rightChildren(node));

        System.out.println("the height of the tree in the Binary Search Tree: " + bst.height(node));
        System.out.print("Using inorder before Deleting node: ");
        bst.inorder();
        bst.deleteAll(node);
        System.out.print("\nUsing inorder after Deleting node: ");
        bst.inorder();

    }
}
