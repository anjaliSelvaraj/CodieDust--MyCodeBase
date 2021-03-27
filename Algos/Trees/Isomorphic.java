package Algos.Trees;

import DataStructures.TreeNode;

/**
 * Created by ANJALI on 3/22/2017.
 */
public class Isomorphic {
    boolean flag = false;

    boolean isIsomorphic(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null)
            return true;

        if ((n1 == null && n2 != null) || (n1 != null && n2 == null))
            return false;

        return isIsomorphic(n1.left, n2.left) && isIsomorphic(n1.right, n2.right);
    }
}

