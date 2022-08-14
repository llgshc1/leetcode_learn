package DAY814;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hcwawe
 * @create 2022/8/15 0:23
 */
public class Sword592 {
    // 用两个队列 一个为主队列 负责pop push 一个为副队列 维护最小值
    Queue<Integer> queue;
    Deque<Integer> deque;
    public void MaxQueue() {
        // 主队列
        queue = new LinkedList<>();
        // 副队列 维护最大值
        deque = new LinkedList<>();
    }

    public int max_value() {
        if(deque.isEmpty()) return -1;
        // 返回维护列的头部
        return deque.peek();
    }

    public void push_back(int value) {
        // 主队列正常入队
        queue.add(value);
        // 副队列要维护队列头是最大值 篮球队长原则 即是如果将要入队的大于前面的 那么比将要入队的小的没有机会最大了 因为先进先出 他们总有在新入队的出队之前出队
        while(!deque.isEmpty()&&deque.getLast()<=value){
            deque.removeLast();
        }
        deque.add(value);
    }

    public int pop_front() {
        // 主队正常抛出 但是如果抛出最大值 副队列也要抛出
        if(queue.isEmpty()) return -1;
        int temp = queue.poll();
        if(temp == deque.peek()){
            deque.poll();
        }
        return temp;
    }
}
