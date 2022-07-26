package DAY807;

/**
 * @author hcwawe
 * @create 2022/8/8 1:05
 */
public class Sword42 {
    public int maxSubArray(int[] nums) {
        // 动态规划 dp数组表示以当前i结尾的子数组的最大值
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        // 零时变量 存储最大值
        int max = dp[0];
        // 遍历nums值 找到最大的存入dp
        for(int i = 1; i < n; i++){
            //如果dp[i - 1] > 0此时最大的子数组的值就可以加上之前的子数组
            if(dp[i - 1] > 0){
                dp[i] = dp[i - 1] + nums[i];
            }else{
                dp[i] = nums[i];
            }
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}
