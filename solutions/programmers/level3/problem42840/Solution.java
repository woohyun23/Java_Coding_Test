package programmers.level3.problem42840;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] num_1 = {1, 2, 3, 4, 5};
        int[] num_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt_1 = 0, cnt_2 = 0, cnt_3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num_1[i % num_1.length]) cnt_1++;
            if (answers[i] == num_2[i % num_2.length]) cnt_2++;
            if (answers[i] == num_3[i % num_3.length]) cnt_3++;
        }

        int max = Math.max(cnt_1, Math.max(cnt_2, cnt_3));

        if (cnt_1 == max) {
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length - 1] = 1;
        }
        if (cnt_2 == max) {
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length - 1] = 2;
        }
        if (cnt_3 == max) {
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length - 1] = 3;
        }

        return answer;
    }
}

// 1번 - 1,2,3,4,5
// 2번 - 2,1,2,3,2,4,2,5
// 3번 - 3,3,1,1,2,2,4,4,5,5