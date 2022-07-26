package DAY801;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 剑指offer 37 字符串排列组合
 * @author hcwawe
 * @create 2022/8/2 0:04
 */
public class Sword37 {
    // 中间变量 存储结果字符串
    List<String> res_temp = new ArrayList<>();
    public String[] permutation(String s) {
        if(s.length() == 0) return new String[0];
        char[] c2s = s.toCharArray();
        Arrays.sort(c2s);
        backTracking(c2s,new boolean[c2s.length],new StringBuilder());
        String[] res = new String[res_temp.size()];
        for(int i = 0;i < res_temp.size();i++){
            res[i] = res_temp.get(i);
        }
        return res;
    }
    private void backTracking(char[] c2s,boolean[] visited,StringBuilder sb){
        //确定收敛条件 返回上一级 将结果加入临时变量
        if(c2s.length == sb.length()){
            res_temp.add(sb.toString());
            return;
        }
        //开始回溯
        for(int i = 0;i < c2s.length ; i ++){
            //当前元素被访问过
            if(visited[i]) continue;
            //去除重复
            if(i != 0 && c2s[i] == c2s[i-1] && !visited[i - 1]) continue;
            //设置被访问过 且向元素sb里加
            visited[i] = true;
            sb.append(c2s[i]);
            //往后推
            backTracking(c2s,visited,sb);
            //不满足条件 回溯 返回上一步
            sb.deleteCharAt(sb.length() - 1);
            visited[i] = false;
        }
    }
}
