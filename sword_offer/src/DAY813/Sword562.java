package DAY813;

/**
 * @author hcwawe
 * @create 2022/8/13 18:25
 */
public class Sword562 {
    public int singleNumber(int[] nums) {
        // 解题思路 一个数字出现了三次 那么他表示为二进制之后 每一位二进制的和值也都能被3整除
        // 所有的数的二进制数加起来之后 出现三次的数每一位二进制之和都会被3整除 然后剩下那个单独的数
        // 求出二进制每一位之和
        if(nums.length == 1) return nums[0];
        // 二进制数组之和 因为题目所给 num[i] < 2 ^31
        int[] binarySum = new int[32];
        for(int num:nums){
            for(int i = 0; i < 32 ;i++){
                // 该位数的二进制就是&三十一个0加上一个1
                binarySum[i] += num&1;
                // 跳到下一个二进制 往右移动一位
                num >>= 1;
            }
        }
        int res = binarySum[0]%3;
        for(int i = 1;  i < 32; i++){
            binarySum[i] = binarySum[i] %3;
            res += Math.pow(binarySum[i]*2,i);
        }
        return res;
    }
}
