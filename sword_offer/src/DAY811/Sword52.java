package DAY811;

import DAY724.ListNode;

/**
 * @author hcwawe
 * @create 2022/8/12 0:12
 */
public class Sword52 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 转圈思想 当A走完 时让他走向B 同理B也是 两条路径和是不变的 所以像一个圈 最会碰到
        ListNode a = headA;
        ListNode b = headB;
        // 当两者没有走到相同节点
        while(a != b){
            // a走完了 指向b
            if(a == null ) a = headB;
            else a = a.next;
            if(b == null) b = headA;
            else b = b.next;
        }
        return a;

    }
}
