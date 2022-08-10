package DAY731;

import DAY624.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hcwawe
 * @create 2022/8/1 1:31
 */
public class Sword37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return "null";
        queue.add(root);
        sb.append(root.val).append(",");
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur.left != null){
                queue.add(cur.left);
                sb.append(cur.left.val).append(",");
            }else{
                sb.append("null,");
            }
            if(cur.right != null){
                queue.add(cur.right);
                sb.append(cur.right.val).append(",");
            }else{
                sb.append("null,");
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strs = data.split(",");
        if(strs.length == 0 || strs[0].equals("null")) return null;
        int index = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(strs[0]));
        queue.add(root);
        while(index < strs.length){
            TreeNode node = queue.poll();
            if(node != null){
                TreeNode left = strs[index].equals("null")?null:new TreeNode(Integer.valueOf(strs[index]));
                queue.add(left);
                index++;
                root.left = left;
                TreeNode right = strs[index].equals("null")?null:new TreeNode(Integer.valueOf(strs[index]));
                queue.add(right);
                root.right = right;
                index ++;
            }

        }
        return root;
    }
}
