package programmers.level3.problem86491;

import java.util.*;


class Solution {
    public int solution(int[][] sizes) {
        int maxWidths = 0;
        int maxHeights = 0;

        for (int[] size : sizes) {
            int tempWidth = Math.max(size[0], size[1]);
            int tempHeight = Math.min(size[0], size[1]);

            maxWidths = Math.max(tempWidth, maxWidths);
            maxHeights = Math.max(tempHeight, maxHeights);
        }

        return maxWidths * maxHeights;
    }
}