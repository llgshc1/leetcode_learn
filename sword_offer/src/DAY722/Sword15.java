package DAY722;

/**
 * 剑指offer2 15 二进制中1的个数
 * @author hcwawe
 * @create 2022/7/22 23:18
 */
public class Sword15 {
    //解题思路见 readme.md 类似于俄罗斯方块的思想 逐一消去1
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            n = n & (n-1);
            res ++;
        }
        return res;
    }
}
