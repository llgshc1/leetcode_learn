package DAY807;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author hcwawe
 * @create 2022/8/8 0:41
 */
public class Sword41 {
    //建一个最大堆 和最小堆
    Queue<Integer> max;
    Queue<Integer> min;
    /** initialize your data structure here. */
    public void MedianFinder() {
        max = new PriorityQueue<>();
        min = new PriorityQueue<>((o1,o2) -> (o2.compareTo(o1)));
    }

    public void addNum(int num) {
        // 使最大堆的个数大于等于最小堆 最多相差1
        // 排序一下 维持最大堆里的元素始终大于最小堆
        max.add(num);
        min.add(max.poll());
        if(max.size() < min.size()){
            max.add(min.poll());
        }
    }

    public double findMedian() {
        if(max.size() == min.size()){
            return (min.peek() + max.peek())/2.0;
        }else{
            return max.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

