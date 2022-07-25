package DAY724;

import DAY624.TreeNode;

/**
 * 剑指offer2 18 对称二叉树
 * @author hcwawe
 * @create 2022/7/24 19:03
 */
public class Sword28 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return dfs(root,root);
    }
    //比较两棵树是否相等
    public boolean dfs(TreeNode q, TreeNode p){
        //两棵树都为null 返回true
        if(q == null && p == null ) return true;
        //一颗为null 一颗不为 false
        if(q == null || p == null) return false;
        //值不相等 false
        if(p.val != q.val ) return false;
        //对称 左右比较
        return dfs(p.left,q.right) && dfs(q.left,p.right);
    }
}
