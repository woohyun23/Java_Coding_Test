package programmers.level3.problem12926;

import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char x : s.toCharArray()) {
            if (x == ' ') {
                answer.append(" ");
            } else if (x >= 'a' && x <= 'z') {
                answer.append((char) ((x - 'a' + n) % 26 + 'a'));
            } else {
                answer.append((char)( (x - 'A' + n) % 26 + 'A'));
            }
        }

        return answer.toString();
    }
}
