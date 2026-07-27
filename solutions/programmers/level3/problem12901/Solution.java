package programmers.level3.problem12901;

import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;

        for (int i = 0; i < a - 1; i++) {
            days += monthDays[i];
        }
        days += b;

        answer = week[(days % 7)];
        return answer;
    }
}