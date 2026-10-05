import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int index = 0; index < targets.length; index++) {
          String target = targets[index];
          int total = 0;
          boolean possible = true;

          for (char x : target.toCharArray()) {
            int minPress = Integer.MAX_VALUE;

            for (int i = 0; i < keymap.length; i++) {
              int position = keymap[i].indexOf(x);

              if (position != -1) minPress = Math.min(minPress, position +1);
            }

            if (minPress == Integer.MAX_VALUE) {
              possible = false;
              break;
            }

            total += minPress;
          }

          answer[index] = possible ? total : -1;
        }

        return answer;
    }
}