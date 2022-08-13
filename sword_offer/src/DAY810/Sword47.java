package DAY810;

/**
 * 剑指offer47
 * @author hcwawe
 * @create 2022/8/10 23:07
 */
public class Sword47 {
    public int maxValue(int[][] grid) {
        // 动态规划 dp存储i,j位置可能的最大值
        // 定义行和列
        int m = grid.length;
        int n = grid[0].length;
        // 初始化动态规划数组
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        // 开始遍历
        for(int i = 0; i < m;i++){
            for(int j = 0;j < n;j++){
                int a,b;
                // 由于不一定有i-1 或者j - 1 所以得存贮临时变量
                a = (i - 1>= 0)?dp[i-1][j]:0;
                b = (j - 1>= 0)?dp[i][j-1]:0;
                dp[i][j] = Math.max(a,b) + grid[i][j];
            }

        }
        return dp[m-1][n-1];
    }
}
