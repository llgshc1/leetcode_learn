package DAY721;

import org.junit.Test;

/**
 * 剑指offer12 剪绳子
 * @author hcwawe
 * @create 2022/7/22 0:27
 */
public class Sword14 {
    //动态规划 dp[i] 为i处最大的绳子剪断乘积 dp[n]自然为结果
    public int cuttingRope(int n) {
        int[] db = new int[n+1];
        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= i -1;j ++){
                db[i] = Math.max(db[i],Math.max(j*(i - j),j * db[i - j]));
            }

        }
        return db[n];
    }
    @Test
    public void test(){
        System.out.println(cuttingRope(120));
    }
}
