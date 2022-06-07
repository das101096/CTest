package Test;

public class Solution17 {
    public static void main(String[] args) {
        int n = 45;
        solution(n);
    }
    public static int solution(int n) {
        StringBuffer sb = new StringBuffer(Integer.toString(n,3));
        String reversedStr = sb.reverse().toString();
        return Integer.parseInt(reversedStr,3);
    }
}
