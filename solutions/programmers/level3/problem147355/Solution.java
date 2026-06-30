package programmers.level3.problem147355;

import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long temp = Long.parseLong(p);
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            if(Long.parseLong(t.substring(i, i +p.length())) < temp || t.substring(i, i +p.length()).equals(p)) answer++;
        }
        return answer;
    }
}