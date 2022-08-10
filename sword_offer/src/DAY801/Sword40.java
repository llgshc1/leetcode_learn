package DAY801;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author hcwawe
 * @create 2022/8/2 0:19
 */
public class Sword40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Queue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2.compareTo(o1) ));
        for(int i:arr){
            queue.add(arr[i]);
            while(!queue.isEmpty()&&queue.size()>k){
                queue.poll();
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
