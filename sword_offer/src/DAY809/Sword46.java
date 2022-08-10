package DAY809;

/**
 * 剑指offer2 46
 * @author hcwawe
 * @create 2022/8/10 1:54
 */
public class Sword46 {
    public int translateNum(int num) {
        //转换字符串 方便处理
        String str = String.valueOf(num);
        //动态规划数组 记录状态 表示字符串的长度为i是 转换的种数
        int[] dp = new int[str.length()+1];
        //字符串长度为1或者0时 只有一种转换的方式
        dp[0] = dp[1] = 1;
        //长度i为2时可能会有不同的转换方式
        for(int i = 2;i <= str.length(); i++){
            String strTemp = str.substring(i-2,i);
            //如果此时这位数字 和他的前一位组合能满足条件
            if(strTemp.compareTo("10")>=0&&strTemp.compareTo("25")<=0){
                dp[i] = dp[i-1] +dp[i-2];
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[dp.length-1];
    }
}
