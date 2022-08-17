package DAY816;

/**
 * @author hcwawe
 * @create 2022/8/16 23:08
 */
public class Sword66 {
    public int[] constructArr(int[] a) {
        // 涉及到的java基础 for(;;操作b){操作a} 先进行a操作再进行b操作这是执行顺序
        int n = a.length;
        int[] b = new int[n];
        // 异步操作 先保存值 在乘 前面的乘积 就跳过了i 乘上i的前半段
        for(int i = 0,product = 1;i < n; i++){
            b[i] = product;
            product *= a[i];
        }
        for(int i = n - 1,product = 1;i >= 0;i --){
            // 乘上i 的后半段
            b[i] = b[i]*product;
            product *=a[i];
        }
        return b;
    }
}
