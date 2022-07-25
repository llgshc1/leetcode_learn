package DAY723;

import org.junit.Test;

import java.util.Arrays;

/**
 * 剑指offer 19 正则表达式
 * @author hcwawe
 * @create 2022/7/23 13:08
 */
public class Sword19 {
    int m = 0;
    int n = 0;
    String s ;
    String p ;
    //动态规划 记录s的i 位置 和p的j 位置的比较结果
    int[][] dp;;
    public boolean isMatch(String s, String p) {
        //初始化 使整个dp数组值全为-1
        n = s.length();
        m = p.length();
        this.s = s;
        this.p = p;
        dp = new int[n+1][m+1];
        for(int i = 0; i <= n;i++){
            Arrays.fill(dp[i],-1);
        }
        //开始动态比较
        return compare(0,0) == 1;
    }
    private int compare(int i, int j){
        //i 和 j 都已遍历到最后的字符串 匹配成功
        if(i == n && j == m)
            return 1;
        //p匹配模式已经结束 s还为结束
        if(j == m)
            return 0;
        //该位置已经记录过 跳过
        if(dp[i][j] != -1)
            return dp[i][j];
        int res = 0;
        //*号特殊情况 *一个*可与零或者多个字符匹配
        if(j + 1<m && p.charAt(j+1) == '*'){
            //与零个匹配时 跳过*
            res = compare(i,j+2);
            //与一个或者多个匹配 与零个匹配的话 则res = 1 不进入下一步
            for(int k = i;k < n && res != 1; k++){
                //从i位置开始匹配 k+ j等着与之匹配 不匹配时跳出
                if(s.charAt(k) != p.charAt(j) && p.charAt(j) !='.') break;
                res = compare(k + 1, j + 2);
            }
        }else if(i != n){
            //非特殊情况正常比较 比较成功往下一位
            if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'){
                res = compare(i+1,j+1);
            }
        }
        return dp[i][j] = res;
    }
    @Test
    public void test(){
        System.out.println(isMatch("aa","a*"));
        System.out.println("aa".length());
    }
}
