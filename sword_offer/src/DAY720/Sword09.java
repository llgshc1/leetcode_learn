package DAY720;

import java.util.Stack;

/**
 * 剑指offer2 09两个堆栈实现队列
 * @author hcwawe
 * @create 2022/7/21 0:36
 */
public class Sword09 {
    //定义两个堆栈 stack1为主栈 stack2为辅助栈
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public void CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
//正常进入主栈
    public void appendTail(int value) {
        stack1.push(value);
    }
    //删除 先将主栈内容弹入辅助栈 辅助栈弹出
    public int deleteHead() {
        copy(stack1,stack2);
        if(stack2.isEmpty()){
            return -1;
        }
        int res = stack2.pop();
        copy(stack2,stack1);
        return res;
    }
    //一个栈摊入另一个栈的方法
    private void copy(Stack<Integer> stack1,Stack<Integer> stack2){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}
