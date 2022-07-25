package DAY723;

import org.junit.Test;

/**
 * 剑指offer2 20有效数字
 * @author hcwawe
 * @create 2022/7/23 17:57
 */
public class Sword20 {
    public boolean isNumber(String s) {
        //预处理 清空空格
        s = s.trim();
        if(s.length() == 0){
            return false;
        }
        //预处理 去掉开头的正负号
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            s = s.substring(1);
        }
        //将字符串当中的E e统一为e
        s = s.replace('E','e');
        if(s.indexOf('e') >= 0){
            int index = s.indexOf('e');
        //从e开始截成两段 前面那段可以带'.'后面那段不能带
            String first = s.substring(0,index);
            String second = s.substring(index + 1);
        //消除后面那段正负号
            if(second.length() > 0){
                if(second.charAt(0) == '+'||second.charAt(0) == '-'){
                    second = second.substring(1);
                }
            }

            return  isAvaildPureNumber(first) && isAvaildNumber(second);

        }
        return isAvaildPureNumber(s);
    }
    //检查是不是带有效数字的分数可以带.
    private boolean isAvaildPureNumber(String s){
        if(s.indexOf('.') >= 0){
            int index = s.indexOf('.');
            String first = s.substring(0,index);
            String second = s.substring(index + 1);
            if(first.length() > 0 && second.length() >0){
                return  isAvaildNumber(first) && isAvaildNumber(second);
            }else if(second.length() > 0){
                return isAvaildNumber(second);
            }else {
                return isAvaildNumber(first);
            }
        }
        return isAvaildNumber(s);
    }
    //检查是不是带有效数字的整数
    private boolean isAvaildNumber(String s){
        if(s.length() == 0) return false;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) < '0'|| s.charAt(i) > '9') return false;
        }
        return true;
    }
    @Test
    public void test(){
        System.out.println(isNumber("-1E-16"));
        System.out.println(isAvaildPureNumber("16"));
    }
}
