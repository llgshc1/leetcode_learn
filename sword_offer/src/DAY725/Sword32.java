package DAY725;

import DAY624.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指offer2 遍历二叉树
 * @author hcwawe
 * @create 2022/7/26 0:19
 */
public class Sword32 {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        //过度变量 不知道数组的长度
        ArrayList<Integer> list = new ArrayList<>();
        //存储二叉树的队列
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur = new TreeNode();
        queue.add(root);
        while(!queue.isEmpty()){
            cur = queue.poll();
            list.add(cur.val);
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right != null){
                queue.add(cur.right);
            }
        }
        int[] res= new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
