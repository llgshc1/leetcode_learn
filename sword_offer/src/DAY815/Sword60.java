package DAY815;

/**
 * @author hcwawe
 * @create 2022/8/15 22:47
 */
public class Sword60 {
    // 思路由于色子的出现是等概率事件 所以概率即为 可能出现次数/排列组合的总数
    // 定容量的时候记得n为实际个数 记录结果的时候记得 数组是0开始的 所以n-1 = 0合法
    public double[] dicesProbability(int n) {
        // 动态规划数组 记录第n 个色子 和为 某一个值的出现次数之和为n+1
        int[][] dp = new int[n][6*n];
        // 记录结果数组
        double[] res = new double[5 * n +1];
        // dp初始化 当色子只有一个时大家概率相等
        for(int i = 0;i < 6;i++){
            dp[0][i] = 1;
        }
        // 动态规划转移方程 例如当三个色子出现和为8时 他可能自己摇出个一 前面的两个色子和为7的
        // 也可能自己摇出个2 前面两个和为6的总数
        for(int i = 1;i < n; i ++){
            // 有n个色子 最小的和至少为n
            for(int j = i; j < 6 *n;j++){
                // 应为自己会摇一次色子点数会在1,6之间 剩下的采用加上上一次dp
                for(int k = 1; k <= 6;k ++){
                    // 色子范围合法 因为数组下标从0开始 所以
                    if(n - 1 >= 0&&j - k >=0){
                        dp[i][j] += dp[i - 1][j - k];
                    }
                }
            }
        }
        // 可能的排列组合
        double sum = Math.pow(6,n);
        // 封装结果
        for(int i = 0;i < n *5 +1;i ++){
            res[i] = dp[n - 1][n - 1 +i]/sum;
        }
        return res;
    }
}
