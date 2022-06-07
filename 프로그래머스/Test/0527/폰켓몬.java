package Test;

import java.util.Arrays;
import java.util.stream.Collector;

public class Solution14 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        System.out.println(nums);
    }
    public static int solution(int[] nums) {
        int answer = 0;

        long count = Arrays.stream(nums)
                .distinct()
                .count();

        if ((nums.length / 2) < (int)count) {
            answer = (nums.length / 2);
        } else {
            answer = (int) count;
        }

        return answer;
    }

}
