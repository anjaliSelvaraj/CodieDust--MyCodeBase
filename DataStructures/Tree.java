package DataStructures;

/**
 * Created by ANJALI on 3/8/2017.
 */
public class Tree {
    public TreeNode root;

    public Tree() {
        setDefaultTree();
    }

    public void setDefaultTree() {
        TreeNode node = new TreeNode(6);
        root = node;
       /* node.left=new TreeNode(4);
        node.left.left=new TreeNode(3);
        node.left.right=new TreeNode(5);
       node.left.left.left=new TreeNode(2);

        node.right=new TreeNode(10);
        node.right.left=new TreeNode(8);
        node.right.right=new TreeNode(11);
        node.right.left.left=new TreeNode(7);
        node.right.left.right=new TreeNode(9);*/

        node.left = new TreeNode(1);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(3);
        node.left.left.left = new TreeNode(4);

        node.right = new TreeNode(5);
        node.right.left = new TreeNode(8);
        node.right.right = new TreeNode(7);
        node.right.left.left = new TreeNode(10);
        node.right.left.right = new TreeNode(9);
    }

    public void preOrder() {
        System.out.println();
        System.out.println("**Pre-order traversal**");
        preOrder(root);
        System.out.print(".");
    }

    private void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + ",");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder() {
        System.out.println();
        System.out.println("**In-order traversal**");
        inOrder(root);
        System.out.print(".");
    }

    private void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + ",");
            inOrder(node.right);
        }
    }

    public void postOrder() {
        System.out.println();
        System.out.println("**Post-order traversal**");
        postOrder(root);
        System.out.print(".");
    }

    private void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + ",");
        }
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        t.inOrder();
        t.preOrder();
        t.postOrder();
    }
}
