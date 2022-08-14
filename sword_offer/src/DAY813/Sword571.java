package DAY813;

/**
 * @author hcwawe
 * @create 2022/8/14 0:40
 */
public class Sword571 {
    public int[] twoSum(int[] nums, int target) {
        // 结果数组
        int[] res = new int[2];
        if(nums.length == 1) return res;
        // 使用两个指针 指向第一个和最后一个 因为数组是有序的
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            // 之和大了 右边的数减小一位
            if(nums[left]+nums[right] > target){
                right --;
            } else if(nums[left] + nums[right] < target){
                left ++;
            }else{
                res[0] = nums[left];
                res[1] = nums[right];
                break;
            }
        }
        return res;
    }
}
