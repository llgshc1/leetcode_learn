package DAY724;

/**
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 *
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * @author hcwawe
 * @create 2022/7/24 18:18
 */
public class Sword26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) return false;
        //根节点匹配
        if(isApart(A,B)) return true;
        //根节点匹配不上 开始递归遍历左右子树
        return isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }
    public boolean isApart(TreeNode A,TreeNode B){
        //b树已经遍历结束
        if(B == null) return true;
        //A树已经遍历完 b还没结束 或者直接不匹配
        if(A == null || A.val != B.val) return false;
        //左右节点递归遍历
        return isApart(A.left,B.left) && isApart(A.right,B.right);
    }

    private class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
