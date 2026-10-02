package programmers.level3.problem77484;

import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int match = 0;


        for (int num : lottos) {
            if (num == 0) {
                zero++;
                continue;
            }

            for (int win_num : win_nums) {
                if (num == win_num) {
                    match++;
                    break;
                }
            }
        }

        answer[0] = 7 - zero - match > 5 ? 6 : 7 - zero - match;
        answer[1] = (7 - match) > 5 ? 6 : 7 - match;

        return answer;
    }
}