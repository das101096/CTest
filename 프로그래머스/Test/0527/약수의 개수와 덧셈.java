package Test;

public class Solution15 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        solution(left,right);
    }
    public static int solution(int left, int right) {
        int answer = 0;
        int cnt = 1;

        for (int i = left; i <= right; i++) {
            for (int j = 1; j < i; j++) {
                if((i%j)==0){
                    cnt++;
                }
            }

            if(cnt%2==0){
                answer+=i;
            } else {
                answer-=i;
            }
            cnt = 1;
        }

        return answer;
    }
}
