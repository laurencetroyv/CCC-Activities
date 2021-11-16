package binaryTree;

public class TestDriver {
    public static void main(String[] args) {
        BSTNode node = new BSTNode(50);
        BST bst = new BST();

        //root
        bst.root = node;
        
        bst.root.left = new BSTNode(45);
        bst.root.right = new BSTNode(40);

        bst.root.left.right = new BSTNode(25);
        bst.root.left.left = new BSTNode(10);
        bst.root.left.left.right = new BSTNode(15);
        
        bst.root.right.left = new BSTNode(5);
        bst.root.right.right = new BSTNode(3);

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
