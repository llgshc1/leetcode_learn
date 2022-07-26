package DAY726;

import DAY624.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指offer2 二叉树路径之和
 * @author hcwawe
 * @create 2022/7/27 0:04
 */
public class Sword34 {
    //结果数组 全局调用
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        backTracking(root,target,new ArrayList<>());
        return res;
    }
    // 回溯算法
    public void backTracking(TreeNode root, int target, List<Integer> path){
        // 遍历结束
        if(root == null) return ;
        // 值进 和减
        path.add(root.val);
        target -= root.val;
        // 和为target 且为叶子节点 当前路径满足条件
        if(target == 0 && root.left == null && root.right == null){
            res.add(new ArrayList<>(path));
        }else{
            // 不满足 左右子树开始遍历
            backTracking(root.left,target,path);
            backTracking(root.right,target,path);
        }
        // 跳回上一节点开始搜索
        path.remove(path.size() - 1);
    }
}
