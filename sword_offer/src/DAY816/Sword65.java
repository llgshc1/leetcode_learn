package DAY816;

/**
 * @author hcwawe
 * @create 2022/8/16 22:23
 */
public class Sword65 {
    // 思路 将两数的相加拆分为二进制只进位 和不进位值的异或
    public int add(int a, int b) {
        int sum1 ,sum2;
        do{
            // 计算不进位
            sum1 = a^b;
            // 计算进位
            sum2  = (a&b)<<1;
            a = sum1;
            b = sum2;
            // 当进位数等于零时结束循环
        }while(b != 0);
        return a ^ b;
    }
}
