package DAY814;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author hcwawe
 * @create 2022/8/14 23:49
 */
public class Sword591 {
    /*解题思路 维护一个双端队列 + 篮球队长思想 + 队列里面存的是index
     *头 尾 尾 头思想维护队列
     *i 数组索引 i >= k -1滑动窗口的出初始长度才能为三 才有最大值
     *(i + 1)-k 滑动窗口的第一位 也是当前滑动窗口结果的索引
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 获取结果长度
        int n = nums.length;
        if(n == 1) return nums;
        // 双端队列 进行维护 保证对头是最大值 用篮球队长法则 就是新入队的大于之前的 之前的已经没有机会当队长了
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[n-k+1];
        // 开始遍历数组
        for(int i = 0;i < n; i ++){
            // 头：维护滑动窗口长度为k 头出列 但是当最大值不在最后一位时不能出列
            // 此时i为即将入队的 getFirst为最前一位的索引 要维持长度 则是两者之前相差k是 即是
            // i - getFirst = k需要头出列
            if(!deque.isEmpty()&&deque.getFirst()==(i - k)){
                deque.removeFirst();
            }
            // 尾：篮球队长原则 如果此时要入队的值已经比前面的大 前面的没有机会做最大值了 前面的出队
            while(!deque.isEmpty()&&nums[deque.getLast()]<=nums[i]){
                deque.removeLast();
            }
            // 尾：尾部入队
            deque.addLast(i);
            // 头 将头部第一个 取出来 由于维护策略 第一个就是最大值 但是只有滑动窗口填满时才能有
            if(i>=k-1){
                res[i-k+1] = nums[deque.getFirst()];
            }

        }
        return res;
    }
    @Test
    public void test(){
        int[] test= new int[]{2, 7, 4};
        maxSlidingWindow(test,2);
    }
}
