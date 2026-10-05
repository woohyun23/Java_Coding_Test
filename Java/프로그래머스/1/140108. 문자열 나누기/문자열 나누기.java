import java.util.*;

class Solution {
    public int solution(String s) {
        int init_num = 1;
        int sec_num = 0;
        int answer = 0;
        char init_char = s.charAt(0);

        if (s.length() == 1) return 1;

        for (int i = 1; i < s.length(); i++) {
          // System.out.printf("init_char : %c\n", s.charAt(i));
          if (s.charAt(i) == init_char) {
            init_num++;  
            // System.out.printf("init_num : %d, sec_num : %d\n",init_num, sec_num);
          }
          else {
            sec_num++;
            // System.out.printf("init_num : %d, sec_num : %d\n",init_num, sec_num);
          }

          if (init_num == sec_num) {
            answer++;
            init_num = 1;
            sec_num = 0;
            if (i < s.length() -2) {
              init_char = s.charAt(i+1);
              i++;
            }
          }
        }

        if (init_num + sec_num != 1) answer++;
        
        return answer;
    }
}