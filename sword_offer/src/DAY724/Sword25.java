package DAY724;

/**
 * 剑指offer2 25
 * @author hcwawe
 * @create 2022/7/24 18:16
 */
public class Sword25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(p1 != null && p2 !=null){
            if(p1.val < p2.val){
                cur.next = p1;
                cur = cur.next;
                p1 = p1.next;
            }else{
                cur.next = p2;
                cur = cur.next;
                p2 = p2.next;
            }

        }
        if(p1 == null){
            cur.next = p2;
        }
        if(p2 == null){
            cur.next = p1;
        }
        return dummy.next;
    }
}
