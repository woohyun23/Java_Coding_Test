import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] stack = new int[ingredient.length];
        int size = 0;

        for (int x : ingredient) {
          stack[size++] = x;

          if (size >= 4) {
            boolean TF = true;
            if (!(stack[size -4] == 1)) TF = false;
            if (!(stack[size -3] == 2)) TF = false;
            if (!(stack[size -2] == 3)) TF = false;
            if (!(stack[size -1] == 1)) TF = false;

            if (TF) {
              answer++;
              size -= 4;
            }
          }
        }
        return answer;
    }
}