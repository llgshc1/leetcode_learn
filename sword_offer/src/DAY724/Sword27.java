package DAY724;

import DAY624.TreeNode;

/**
 * 剑指offer2 27二叉树的镜像
 * @author hcwawe
 * @create 2022/7/24 18:49
 */
public class Sword27 {
    public TreeNode mirrorTree(TreeNode root) {
        //root为空 结束递归
        if(root == null) return null;
        //不为空 左右节点交换
        swap(root);
        //递归左右节点
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
    public void swap(TreeNode root){
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
    }
}
