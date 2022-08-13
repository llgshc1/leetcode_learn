package DAY813;

import DAY624.TreeNode;

/**
 * @author hcwawe
 * @create 2022/8/13 17:29
 */
public class Sword552 {
    // 注意平衡二叉树的条件 不只根节点 而且任意节点都要是平衡二叉树
    public boolean isBalanced(TreeNode root) {
        // 获取左右节点深度
        int left = getDeep(root.left);
        int right = getDeep(root.right);
        // 如果左右节点相差不差过一 即为平衡 同时还要遍历左右子树
        return left-right>=-1&&left-right<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
    // 定义一个方法 获取二叉树的深度
    public int getDeep(TreeNode root){
        if(root == null) return 0;
        int l = getDeep(root.left);
        int r = getDeep(root.right);
        return l > r?l + 1:r +1;
    }
}
