package DAY813;

import DAY624.TreeNode;

/**
 * @author hcwawe
 * @create 2022/8/13 17:14
 */
public class Sword551 {
    // 主函数就是求某个二叉树的深度
    // 二叉树的深度比根节点的多一
    public int maxDepth(TreeNode root) {
        // 定义收敛条件 二叉树遍历到底 深度为0
        if(root == null) return 0;
        // 左右子树开始递归 得到左右子树的深度
        int leftDeep = maxDepth(root.left);
        int rightDeep = maxDepth(root.right);
        // 最长 所以返回大的那个 而且次函数是求根节点 而遍历出的是子节点 所以要+1
        return leftDeep > rightDeep ? (leftDeep + 1):(rightDeep +1);
    }
}
