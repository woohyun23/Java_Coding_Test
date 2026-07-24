package programmers.level3.problem134240;

import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        String res = "";
        for (int i = 1; i < food.length; i++) {
            if (food[i] < 2) continue;
            else {
                for (int j = 0; j < food[i] / 2; j++) {
                    answer.append(i);
                }
            }
        }
        answer.append(0);

        String temp = answer.toString();
        res += temp + answer.reverse().toString().substring(1);

        return res;
    }
}