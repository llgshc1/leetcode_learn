package DAY807;

/**
 * 剑指offer43 1的个数
 * @author hcwawe
 * @create 2022/8/8 1:28
 */
public class Sword43 {
    public int countDigitOne(int n) {
        int count = 0;
        if(n < 10) return 1;
        for(long pos = 1;pos <= n;pos *=10){
            int high = n /(int)pos;
            int low = n % (int)pos;
            if(high % 10 == 1){
                count += low+1;
            }
            count += (high+8)/10*pos;

        }
        return count;
    }
}
