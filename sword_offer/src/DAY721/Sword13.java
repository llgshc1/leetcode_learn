package DAY721;

import org.junit.Test;

/**
 * 剑指offer13 青蛙移动问题
 * @author hcwawe
 * @create 2022/7/21 19:56
 */
//思路：到达：能满足题目条件 visted ： 能访问 能到达的周围四个格子
public class Sword13 {
    //局部变量记录结果 每一个方法都能使用
    private int count = 0;
    public int movingCount(int m, int n, int k) {
        //数组成立不了 直接退出
        if (m < 0 || n < 0)
            return -1;
        boolean[][] isVisted = new boolean[m][n];
        //深度优先搜索
        dfs(m,n,k,isVisted,0,0);
        return count;

    }
    private void dfs(int m,int n,int k,boolean[][] isVisted,int x,int y){
        //判断是否越界 和是否访问过
        if(x < 0|| x >= m || y < 0|| y >= n||isVisted[x][y])
            return;
        //没有访问过 标记为true
        isVisted[x][y] = true;
        //满足条件 记录+1
        if(getSum(x,y)<=k){
            count ++;
        //上下左右四个方向 个移动一次
            int[] xMove = {1,-1,0,0};
            int[] yMove = {0,0,1,-1};
            for(int i = 0;i < 4; i ++){
                x += xMove[i];
                y += yMove[i];
                dfs(m,n,k,isVisted,x,y);
            }

        }else{
        //不能到达 返回上一次调用栈
            return;
        }
    }
    //获取行列数之和
    private int getSum(int x,int y){
        int res = 0;
        while(x > 0){
            res += x % 10;
            x = x / 10;
        }
        while(y > 0){
            res += y%10;
            y = y/10;
        }
        return res;
    }
    @Test
    public void  test(){
        int i = movingCount(38, 15, 9);
        System.out.println(i);
    }
}
