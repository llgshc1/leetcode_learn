package DAY815;

/**
 * @author hcwawe
 * @create 2022/8/15 23:32
 */
public class Sword62 {
    //阿瑟夫环 f(N,M) = （f(N-1,M）+M）% N
    public int lastRemaining(int n, int m) {
        int res = 0;
        for(int i = 2;i <= n;i ++){
            res = (res+m)%i;
        }
        return res;
    }
}
