package programmers.problem12933;

import java.util.Arrays;

class Solution {
    public long solution(long input) {
        String str = String.valueOf(input);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i];
        }
        return Long.parseLong(res);
    }

}
