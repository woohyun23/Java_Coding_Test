package programmers.level1.problem12935;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        if (arr.length == 1) return new int[]{-1};

        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x < min) min = x;
        }

        int idx = 0;
        for (int x : arr) {
            if (x != min) answer[idx++] = x;
        }

        return answer;
    }
}