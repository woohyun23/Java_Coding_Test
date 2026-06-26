package programmers.level1.problem12910;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for (int x : arr) {
            if (x % divisor == 0) {
                answer = java.util.Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = x;
            }
        }
        if (answer.length == 0) {
            answer = java.util.Arrays.copyOf(answer, 1);
            answer[0] = -1;
        }
        else Arrays.sort(answer);
        return answer;
    }
}