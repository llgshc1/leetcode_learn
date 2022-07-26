package DAY725;

import java.util.Stack;

/**
 * 剑指offer2 31进出栈顺序
 * @author hcwawe
 * @create 2022/7/25 23:57
 */
public class Sword31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        //两者都不为空
        if(pushed == null || popped == null) return false;
        //长度不同 必然false
        if(popped.length != pushed.length) return false;
        //建立辅助站
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        //辅助站入栈 并将栈顶元素与poped比较 相同弹出 不相同则push继续入站
        for(int j = 0; j < popped.length; j++){
            stack.push(pushed[j]);
            while(!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i ++;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
