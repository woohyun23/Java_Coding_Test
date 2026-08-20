package programmers.level3.problem161989;

import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = 0, end = 0;

        for (int x : section) {
            if (x > end) {
                answer++;
                end = x + m -1;
            }
        }

        return answer;
    }
}
