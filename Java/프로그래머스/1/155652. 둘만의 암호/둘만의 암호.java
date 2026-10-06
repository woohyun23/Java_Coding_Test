import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (char s_x : s.toCharArray()) {
          char temp = s_x;
          int cnt = 0;

          while (cnt < index) {
            temp++;
            if (temp > 'z') temp = 'a';

            if (skip.contains(String.valueOf(temp))) continue;

            cnt++;
          }

          answer += temp;
        }

        return answer;
    }
}