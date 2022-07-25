package DAY725;

/**
 * 剑指offer2 29二维数组旋转打印
 * @author hcwawe
 * @create 2022/7/25 22:11
 */
public class Sword29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix .length == 0){
            return new int[]{};
        }
        //遍历左边界
        int left = 0;
        //右边界
        int right = matrix[0].length - 1;
        //上边界
        int top = 0;
        //下边界
        int bottom = matrix.length - 1;
        //存储结果
        int[] res = new int[(right + 1)*(bottom + 1)];
        int index = 0;
        while(true){
            //从左往右跑
            for(int i = left; i <= right; i++){
                res[index] = matrix[top][i];
                index ++;
            }
            //遍历完最上面 top++
            if(++top > bottom){
                break;
            }
            //从上往下跑
            for(int i = top; i<= bottom; i++){
                res[index] = matrix[i][right];
                index ++;
            }
            //最右列剔除 right--
            if(--right < left){
                break;
            }
            //从右往左跑
            for(int i = right; i >= left;i --){
                res[index] = matrix[bottom][i];
                index ++;
            }
            //最下一行剔除 bottom--
            if(--bottom < top){
                break;
            }
            //从下往上跑
            for(int i = bottom;i >= top;i --){
                res[index] = matrix[i][left];
                index ++;
            }
            if(left++ > right){
                break;
            }

        }
        return res;
    }

}
