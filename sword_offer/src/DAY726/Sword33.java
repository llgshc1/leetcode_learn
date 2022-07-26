package DAY726;

import org.junit.Test;

/**
 * 判断一个数组是否为二叉树后续遍历
 * @author hcwawe
 * @create 2022/7/26 23:19
 */
public class Sword33 {
    public boolean verifyPostorder(int[] postorder) {
        //判断是否为空 空也为真
        if(postorder.length == 0|| postorder == null) return true;
        return dfs(postorder,0,postorder.length - 1);
    }
    private boolean dfs(int[] postorder,int start,int end){
        // 遍历到最后一个了
        if(start >= end ) return true;
        // 后序遍历最后一个就是根节点
        int root = postorder[end];
        // 比跟节点小的数都是左子树 找到左子树结束的地方
        int i = 0;
        while(i < end && postorder[i] < root) i++;
        // 右子树都得比根节点大 否则就不是
        for(int j = i; j < end ; j++){
            if(postorder[j] < root){
                return false;
            }
        }
        // 开始递归 左右子树也得满足条件 此时把根节点剔除
        return dfs(postorder,start,i - 1) && dfs(postorder,i , end - 1);
    }
    @Test
    public void test(){
        int[] test = new int[1];
        System.out.println(test);
        System.out.println(verifyPostorder(test));
    }
}
