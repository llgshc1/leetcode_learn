package DAY722;

/** 剑指offer2 16整数幂
 * @author hcwawe
 * @create 2022/7/22 23:50
 */
public class Sword16 {
    public double myPow(double x, int n) {
    //判断正负 与n 的奇数偶数
        if(n > 0){
            return pow(x,n);
        }else{
            return 1/pow(x,Math.abs(n));
        }
    }
    private double pow(double x,int n){
        if(n == 0){
            return 1;
        }
        double res = pow(x,n/2);
        if (n % 2 == 0){
            return res * res;
        }else{
            return res * res * x;
        }
    }
}
