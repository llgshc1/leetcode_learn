package DAY810;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指offer2 48
 * @author hcwawe
 * @create 2022/8/11 0:13
 */
public class Sword48 {
    public int lengthOfLongestSubstring(String s) {
        // 新建一个Hash表去重 键为当前字母 值为上一次出现的下标
        Map<Character,Integer> map = new HashMap<>();
        // res存储最终结果 temp存储当前的最长结果
        int res = 0, temp = 0;
        // 开始遍历s
        for(int i = 0;i < s.length();i ++){
            // 获取该字符上一次出现的位置 没有的话默认为-1
            int j = map.getOrDefault(s.charAt(i),-1);
            // 将此数字以及出现的位置放入Hash表
            map.put(s.charAt(i),i);
            // 更新此时的temp 如果i 到 j的位置大于temp 因为默认开始是-1说明还没遇到重复的了 如果i-j小于 册说明这一段内有了重复的
            temp = temp  < i-j ?temp+1:i-j;
            // 更新结果当中的最大值
            res = Math.max(res,temp);
        }
        return res;
    }
}
