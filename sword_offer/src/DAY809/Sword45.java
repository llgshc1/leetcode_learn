package DAY809;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 剑指offer2 45
 * @author hcwawe
 * @create 2022/8/9 22:46
 */
public class Sword45 {
    public String minNumber(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        // int[]转为字符串数组
        String[] ss = new String[nums.length];
        for(int i = 0;i < nums.length;i++){
            ss[i] = String.valueOf(nums[i]);
        }
        // 按照字符串比较的规则排序 从小到大
        Arrays.sort(ss,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                return (s1 + s2).compareTo(s2 + s1);
            }
        });
        // 数组拼接起来
        StringBuilder sb = new StringBuilder();
        for(String s:ss){
            sb.append(s);
        }
        return sb.toString();
    }
}
