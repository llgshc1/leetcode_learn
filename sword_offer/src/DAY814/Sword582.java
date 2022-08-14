package DAY814;

/**
 * @author hcwawe
 * @create 2022/8/14 23:59
 */
public class Sword582 {
    public String reverseLeftWords(String s, int n) {
        if(s.length() == 1) return s;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb1.append(s.substring(0,n));
        sb2.append(s.substring(n,s.length()));
        sb1 = sb2.append(sb1);
        return sb1.toString();
    }
}
