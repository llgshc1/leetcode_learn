package DAY624;

import java.util.Arrays;

/**
 * 剑指offer2 07 重建二叉树
 * @author hcwawe
 * @create 2022/7/20 18:13
 */
public class Sword07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // 递归结束条件 当前子树没有分支时结束
        if(preorder == null || preorder.length == 0 )
            return null;
        //创建二叉树
        TreeNode treeNode = new TreeNode(preorder[0]);
        //找到根节点
        int index = findRootPos(preorder,inorder);
        //左右递归 递归本函数参数为 前序遍历 中序遍历
        treeNode.left = buildTree(Arrays.copyOfRange(preorder,1,index + 1),
                Arrays.copyOfRange(inorder,0,index ));
        treeNode.right = buildTree(Arrays.copyOfRange(preorder,index +1,preorder.length),
                Arrays.copyOfRange(inorder,index+1,inorder.length));
        return treeNode;
    }
    public static int findRootPos(int[] preorder,int[] inorder){
        for(int i = 0; i < preorder.length; i++){
            if(inorder[i] == preorder[0])
                return i;
        }
        return 0;
    }
}
