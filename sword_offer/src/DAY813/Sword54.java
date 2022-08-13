package DAY813;

import DAY624.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指offer2 54
 * @author hcwawe
 * @create 2022/8/13 16:59
 */
public class Sword54 {
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        list = inorder(root,list);
        return list.get(list.size() - k);
    }
    // 中序遍历左根右 对于二叉搜索树 中序遍历即是排序
    public List<Integer> inorder(TreeNode tree,List list){
        // 定义收敛条件
        if(tree == null ) return null;
        // 递归左子树
        inorder(tree.left,list);
        // 获取到的值加入list
        list.add(tree.val);
        // 递归右子树
        inorder(tree.right,list);
        return list;
    }
}
