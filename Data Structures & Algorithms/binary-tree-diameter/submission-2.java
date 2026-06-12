/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    int maxDia = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null) return 0;
        heightTree(root);

        return maxDia;
    }

    public int heightTree( TreeNode A){

        if( A == null) return 0;
        int height = 0;
        int leftHeight = heightTree(A.left);
        int rightHeight = heightTree(A.right);

        maxDia = Math.max( maxDia, leftHeight + rightHeight);

        height = 1 + Math.max( leftHeight, rightHeight);

        return height;
    }
}
