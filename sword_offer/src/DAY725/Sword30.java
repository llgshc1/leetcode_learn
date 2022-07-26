package DAY725;

import java.util.Stack;

/**
 * 剑指offer2 30minStack
 * @author hcwawe
 * @create 2022/7/25 23:16
 */
public class Sword30 {
    Stack<Integer> s1;
    Stack<Integer> s2;
    /** initialize your data structure here. */
    public Sword30() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
        if( s2.isEmpty() || x <= s2.peek()){
            s2.push(x);
        }
    }

    public void pop() {
        if(s1.pop().equals(s2.peek())){
            s2.pop();
        }
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}
