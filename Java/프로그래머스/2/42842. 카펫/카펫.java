import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int height = (int) Math.sqrt(total); height >= 3; height--) {
          // 세로 길이로 나누어 떨어져야 직사각형 가능
          if (total % height != 0) {
            continue;
          }

          int width = total / height;

          // 테두리를 한 줄씩 제거한 내부 넓이 확인
          if ((width - 2) * (height - 2) == yellow) {
            return new int[]{width, height};
          }
        }

        return new int[0];
    }
}