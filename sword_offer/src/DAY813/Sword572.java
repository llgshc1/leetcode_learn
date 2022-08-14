package DAY813;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcwawe
 * @create 2022/8/14 0:39
 */
public class Sword572 {
    public int[][] findContinuousSequence(int target) {
        // 解题思路类似于上一题加一个滑动窗口 但定义一个left 定义一个right left和right中间的数组就满足条件
        // 但是在该题当中 我们应当先找到最长的数组 之后再缩小范围 所以left从1开始 right 从2 开始
        int left = 1;
        int right = 2;
        List<int[]> list = new ArrayList<>();
        // 左右重合的时候 构不成数组 结束循环
        while(left < right){

            // 差值为1的等差数列n项和 左闭右闭
            int sum =(right - left + 1)*(right + left)/2;
            // 满足条件 将该left 和 right 之间全部加入结果集
            if(sum == target){
                int[] temp = new int [right - left +1];
                for(int i = 0; i < temp.length ; i++){
                    temp[i] = left +i;

                }
                left ++;
                list.add(temp);
            }else if(sum < target){
                // 和小于 加大数组长度
                right ++;
            }else{
                left ++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
