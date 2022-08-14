package DAY813;

import org.junit.Test;

/**
 * @author hcwawe
 * @create 2022/8/14 1:06
 */
public class Sword581 {
    public String reverseWords(String s) {
        // 该题注意一个函数s.trim()去掉首尾空格 注意两种种特殊情况
        // 1 中间有很多空格 2 遍历到了最后一位
        String[] strs = s.trim().split(" ");
        // 为了少占用空间 用一个StringBuilder；
        StringBuilder temp = new StringBuilder();
        // 从后开始遍历String数组
        for(int i = strs.length -1;i >= 0;i --){
            // 第一种情况 分割出了" "数组
            if(strs[i].equals(" ")||strs[i].equals("")) {
                continue;
            }
            // 第二种情况 到最后一位了 前面不需要加" "
            if(i == 0){
                temp.append(strs[i].trim());
            }else{
                // 正常情况 加" "分隔
                temp.append(strs[i].trim()).append(" ");
            }
        }
        return temp.toString();
    }
    @Test
    public void test(){
        System.out.println(reverseWords("a good   example"));
    }
}
