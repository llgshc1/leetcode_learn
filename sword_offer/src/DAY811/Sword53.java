package DAY811;

/**
 * @author hcwawe
 * @create 2022/8/12 0:29
 */
public class Sword53 {
    public int search(int[] nums, int target) {
        // 二分查找法 先定义左右边界
        int left = 0;
        int right = nums.length - 1;
        // 左右边界没有重合时
        while(left < right){
            // 定义中间折中
            int mid = left + (right - left)/2;
            //中间值大于target 取左半区间
            if(nums[mid] >= target){
                right = mid;
            }
            // 中间值小于target 取右半区间
            if(nums[mid] < target){
                left = mid +1;
            }


        }
        int count = 0;
        while(left<nums.length && nums[left++] == target) count++;
        return count;
    }
}
