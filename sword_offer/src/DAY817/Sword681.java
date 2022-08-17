package DAY817;

import DAY624.TreeNode;

/**
 * @author hcwawe
 * @create 2022/8/17 21:16
 */
public class Sword681 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            // 使用递归 二叉树特点 左子树都比根节点小 右子树都比根节点大
            if(p.val < root.val&& q.val < root.val) return lowestCommonAncestor(root.left,p,q);
            // 都比根节点大 说明都在右子树
            if(p.val>root.val && q.val>root.val) return lowestCommonAncestor(root.right,p,q);
            // 一个大一个小 说明在二叉树两旁 在两旁的话祖先就只能是根节点
            return root;
        }
    }
}
