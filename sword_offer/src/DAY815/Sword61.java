package DAY815;

/**
 * @author hcwawe
 * @create 2022/8/15 23:14
 */
public class Sword61 {
    // 可以推导 在去掉零并且没有重复的话的情况下 max -min < 5一定能排列出顺子
    public boolean isStraight(int[] nums) {
        // 判断重复数组 下标为poker的值 数组的值为出现次数
        int[] repeat = new int[14];
        //    记录牌堆最大值 最小值
        int max = 0;
        int min = 14;
        for(int i = 0;i < 5;i ++){
            //    牌等于零时 直接跳过
            if(nums[i] == 0) continue;
            // 如果有重复数字 直接返回false
            if(repeat[nums[i]] != 0) return false;
            // 记录出现的数字
            repeat[nums[i]] ++;
            // 记录最大最小值
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        return max - min < 5;
    }
}
