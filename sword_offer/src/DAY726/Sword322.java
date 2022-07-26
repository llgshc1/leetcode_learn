package DAY726;

import DAY624.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指offer2 322 之字打印二叉树
 * @author hcwawe
 * @create 2022/7/26 22:34
 */
public class Sword322 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //存储结果
        List<List<Integer>> res = new LinkedList<>();
        //root 判断
        if(root == null) return res;
        //存储节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //判断当前层数是否为奇数层 从1开始
        boolean isOddNumber = false;
        while(!queue.isEmpty()){
            //获取当前节点 有几个数
            int size = queue.size();
            //奇偶交替
            isOddNumber = !isOddNumber;
            //定义存储每一层的双向链表
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i = 0;i < size;i ++){
                TreeNode node = queue.poll();
                //是奇数层的话 从后往前
                if(isOddNumber){
                    temp.addLast(node.val);
                }else{
                    temp.addLast(node.val);
                }
                //左右子树进入队列
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(temp);
        }
        return res;
    }
}
