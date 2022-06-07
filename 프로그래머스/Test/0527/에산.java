package Test;

import java.util.Arrays;

public class Solution16 {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        solution(d,10);
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if(budget >= 0) {
                cnt++;
            }
            answer = cnt;
        }

        return answer;
    }
}
