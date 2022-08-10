package DAY808;

/**
 * 数字序列化
 * @author hcwawe
 * @create 2022/8/9 8:55
 */
public class Sword44 {
    public int findNthDigit(int n) {
        //i为当前位数 s为每一位的个数 base等于每一位的起点
        long i = 1, s = 9,base = 1;
        while(n > s * i){
            n -= s * i;
            i ++;
            s *= 10;
            base *= 10;
        }
        //此时n 为剩下的数字 向下取整找到改数字
        long num = base + (n + i - 1)/i - 1;
        //模i找到是第几位
        long r = n%i==0?i:n%i;
        for(int j = 1;j <= i - r;j ++){
            num /= 10;
        }
        return (int)num%10;
    }
}
