package DAY731;

import java.util.HashMap;

/**
 * @author hcwawe
 * @create 2022/8/1 0:32
 */
public class Sword35 {
    public Node copyRandomList(Node head) {
        Node cur = head;
        //建立HashMap 存放复制前后的一一对应关系
        HashMap<Node,Node> map = new HashMap<>();
        while(cur != null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        // 建立两个指针的联系
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
