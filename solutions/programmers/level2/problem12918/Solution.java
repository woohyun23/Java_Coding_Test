package programmers.level2.problem12918;

import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (!(s.length() == 4 || s.length() == 6)) return false;
        for (char x : s.toCharArray()) {
            if (!(x >= '0' && x <= '9')) return false;
        }
        return answer;
    }
}