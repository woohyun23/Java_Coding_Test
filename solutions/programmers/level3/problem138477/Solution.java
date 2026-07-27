package programmers.level3.problem138477;

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] temp = new int[k];
        int size = 0;

        for (int i = 0; i < score.length; i++) {
            if (size < k) {
                temp[size++] = score[i];
            } else if (score[i] > temp[0]) {
                temp[0] = score[i];
            }
            Arrays.sort(temp, 0, size);
            answer[i] = temp[0];
        }

        return answer;
    }
}