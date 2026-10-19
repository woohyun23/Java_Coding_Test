import java.util.*;

class Solution {
    public int[] solution(String s) {
        int changeCount = 0;
        int zeroCount = 0;

        while (!s.equals("1")) {
            int oneCount = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }

            s = Integer.toBinaryString(oneCount);
            changeCount++;
        }

        return new int[] {changeCount, zeroCount};
    }
}
