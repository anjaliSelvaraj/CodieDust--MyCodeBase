package DataStructures;

/**
 * Created by ANJALI on 3/8/2017.
 */


public class TreeNode {
    //Every node in a tree holds a data and pointer to left and right node
    int data;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}
