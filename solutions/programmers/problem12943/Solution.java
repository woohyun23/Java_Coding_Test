package programmers.problem12943;

class Solution {
    public int solution(int num) {
        int cnt = 0;
        long value = num;
        if (value == 1) return 0;
        while (value != 1) {
            if (cnt == 500) return -1;

            if (value % 2 == 0) value /= 2;
            else value = 3 * value + 1;
            cnt++;
        }
        return cnt;
    }
}
