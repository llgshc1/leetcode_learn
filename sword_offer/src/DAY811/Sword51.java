package DAY811;

/**
 * @author hcwawe
 * @create 2022/8/11 23:07
 */
public class Sword51 {
    public int reversePairs(int[] nums) {
        // 分治思想
        // 判断参数是否合法
        int n = nums.length;
        if(n < 2) return 0;
        // 不改变原数组 copy一个备份
        int[] copy = new int[n];
        for(int i = 0; i <n ; i++){
            copy[i] = nums[i];
        }
        // 定义一个中间变量
        int[] temp = new int[n];
        // 返回分治的结果
        return reverse(copy , 0 , n-1 , temp );
    }
    // 递归开始 开始分
    private int reverse(int[] nums , int left, int right,int[] temp){
        // 定义收敛条件
        if(left == right) return 0;
        // 防止int类型内存越界
        int mid = left + (right - left)/2;
        // 左拆一半
        int leftReverse = reverse(nums , left ,mid,temp);
        // 右拆一半
        int rightReverse = reverse(nums , mid + 1,right ,temp);
        if (nums[mid] <= nums[mid + 1]) {
            return leftReverse + rightReverse;
        }


        // 归并排序 计数
        int midMerge = countMerge( nums , left , mid,right,temp);
        return leftReverse + rightReverse + midMerge;
    }
    private int countMerge(int[] nums,int left,int mid,int right,int[] temp){
        // 给辅助排序数组赋值
        for(int i = left;i <= right; i++){
            temp[i] = nums[i];
        }
        // 归并排序 将数组分成两个部分
        int i = left;
        int j = mid + 1;
        int count = 0;
        for(int k = left ; k <= right;k ++){
            // 左半部分排序完
            if(i == mid +1){
                nums[k] = temp[j];
                j ++;
            }else if(j == right + 1){
                // 右半部分排序完
                nums[k] = temp[i];
                i ++;
            }else if(temp[i] <= temp[j]){
                //左半部分归并回去
                nums[k] = temp[i];
                i ++;
            }else{
                // 右半部分归并回去 此时左半部分的都比num[j]大 都为逆序对
                nums[k] = temp[j];
                j ++;
                count += (mid - i + 1);
            }
        }
        return count;
    }
}
