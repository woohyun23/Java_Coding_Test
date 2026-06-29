package programmers.level2.problem12940;

import java.math.BigInteger;
import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }

    public int GCD(int a, int b) {
        int res = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) res = i;
        }

        return res;
    }
}