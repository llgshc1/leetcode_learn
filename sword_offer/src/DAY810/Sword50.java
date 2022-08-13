package DAY810;

/**
 * @author hcwawe
 * @create 2022/8/11 0:41
 */
public class Sword50 {
    public char firstUniqChar(String s) {
        if(s.equals(" ")) return ' ';
        // 创建一个26的数组作为字典 数组的下标即为a-z 值即为出现的次数
        int[] target = new int[26];
        // 记录出现的次数
        for(int i = 0;i < s.length(); i++){
            target[s.charAt(i) - 'a']++;
        }
        // 找到出现次数为一的字符
        for(int i = 0;i < s.length();i ++){
            if(target[s.charAt(i) - 'a']== 1) return s.charAt(i);
        }
        return ' ';
    }
}
