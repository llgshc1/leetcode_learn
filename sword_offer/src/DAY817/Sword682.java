package DAY817;

import DAY624.TreeNode;

/**剑指offer2 over
 * @author hcwawe
 * @create 2022/8/17 21:17
 */
public class Sword682 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 定义递归条件 当数遍历到空或者 遇到p \ q时 结束遍历
        if(root == null||root == p|| root == q) return root;
        // 找到左右分支里有没有q p的祖先
        TreeNode l = lowestCommonAncestor(root.left,p,q);
        TreeNode r = lowestCommonAncestor(root.right,p,q);
        // 左右都没有对应节点
        if(l == null && r ==null) return null;
        // 两边都有对应节点 祖先就是根
        if(l != null && r != null) return root;
        // 特殊情况排除 谁有对应节点祖先就是谁
        return l != null? l:r;
    }
}
