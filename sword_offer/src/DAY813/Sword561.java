package DAY813;

/**
 * @author hcwawe
 * @create 2022/8/13 18:23
 */
public class Sword561 {
    /*
    解题思路 1:0 异或任何数都为它本身 2 任何数异或他本身都为0
    3 负数在计算机的表示就是按位取反加一 4 a^b^c = b^c^a异或顺序不影响结果
    */
    public int[] singleNumbers(int[] nums) {
        // 定义一个数 接收数组内异或自己本身的结果 因为其他数字出现了两边 所以结果就是那两个数的异或
        int sum = 0;
        for(int num:nums){
            sum ^= num;
        }
        // num是那两个唯一的数异或的结果 所以找出那两个数不同的右边第一位 作为区分
        // 将他们的结果取反然后与运算 就可以找到他们不同的那一位为1 其余为0 作为分组依据
        int flag = sum & ( -sum);
        // 定义结果变量 初始值为0
        int[] res = new int[2];
        // 开始遍历原数组 原数组与flag与运算的值只有一个值 所以相同数字相同组 不同数字不同组
        for(int num: nums){
            // 第一组
            if((num&flag) == 0){
                // 该数字如果重复的话就会被清空
                res[0] ^= num;
            }else{
                res[1] ^= num;
            }
        }
        return res;
    }
}
