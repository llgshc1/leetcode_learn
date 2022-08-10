package DAY801;

/**
 * @author hcwawe
 * @create 2022/8/2 0:18
 */
public class Sword39 {
    public int majorityElement(int[] nums) {
        //布尔投票发 遇到相同的加一票 超过数组一半 即是超过其他数组出现的和
        if(nums.length == 0 ) return 0;
        int base = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == base){
                count++;
            }else{
                count--;
            }
            if(count==0){
                base = nums[i];
                count++;
            }
        }
        return base;
    }
}
