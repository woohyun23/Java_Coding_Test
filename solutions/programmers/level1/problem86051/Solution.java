package programmers.level1.problem86051;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        for (int x : numbers) {
            arr[x] = 0;
        }

        for (int x : arr) answer += x;
        return answer;
    }
}
