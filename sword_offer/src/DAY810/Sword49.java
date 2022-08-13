package DAY810;

/**
 * 剑指offer2 49
 * @author hcwawe
 * @create 2022/8/11 0:14
 */
public class Sword49 {
    public int nthUglyNumber(int n) {
        // 建立动态规划的dp存储i位置的丑数
        int[] dp = new int[n+1];
        dp[1] = 1;
        // 三个指针 指向乘以2 乘以3 乘以4得到的丑数
        int p2 = 1,p3 = 1,p5 = 1;
        // 开始循环 从第二个丑数开始 因为第一个丑数是1
        for(int i = 2;i <= n; ++i){
            // 动态规划 1.丑数只能有上某一个丑数乘2,3，5得到且 2.丑数是严格递增的
            int temp = Math.min(dp[p2]*2,dp[p3]*3);
            dp[i] = Math.min(temp,dp[p5]*5);
            if(dp[i] == dp[p2]*2){
                p2 ++;
            }
            if(dp[i] == dp[p3]*3){
                p3 ++;
            }
            if(dp[i] == dp[p5]*5){
                p5 ++;
            }
        }
        return dp[n];
    }
}
