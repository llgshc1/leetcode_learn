package DAY723;

/**
 * 剑指offer2 奇数偶数交换
 * @author hcwawe
 * @create 2022/7/23 22:10
 */
public class Sword21 {
    public int[] exchange(int[] nums) {
        //定义左右指针
        int left = 0;
        int right = nums.length - 1;
        //左指针
        while(left < right){
        //让左指针 右指针指到需要交换的位置 注意佐佑数组不能越界
            while(left < nums.length && (nums[left]%2) != 0) left++;
            while(right > 0 && (nums[right] % 2) == 0) right--;
        //交换 交换完之后 指针到了会自己移动的位置 所以不需要自己+-
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}
