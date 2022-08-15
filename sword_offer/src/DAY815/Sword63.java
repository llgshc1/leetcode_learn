package DAY815;

/**
 * @author hcwawe
 * @create 2022/8/16 0:16
 */
public class Sword63 {
    //利用短路表达式特性 达到if效果
    public int sumNums(int n) {
        int sum = n;
        boolean flag = n > 0 &&(sum += sumNums(n-1))>0;
        return sum;
    }
}
