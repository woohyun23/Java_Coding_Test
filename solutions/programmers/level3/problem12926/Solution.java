package programmers.level3.problem12926;

import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (x == ' ') {
                answer += " ";
                continue;
            }
            int ascii = (int)x + n;
            if (ascii > 122) ascii -= 26;
        }

        return answer;
    }
}
