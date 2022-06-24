package DAY624;


import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Leetcode07 {
//    树 递归
    int preindex = 0;
    int inindex = 0;//结束标志
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder,inorder,null);
    }

    private TreeNode dfs(int[] preorder, int[] inorder, TreeNode finish) {
//        遍历过程
//        前序 根左右
        TreeNode root = new TreeNode(preorder[1])
    }
}