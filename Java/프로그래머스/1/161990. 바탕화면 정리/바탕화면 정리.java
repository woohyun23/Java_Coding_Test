import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {

        int minX = wallpaper.length; 
        int minY = wallpaper[0].length();
        int maxX = 0, maxY = 0;
        
        for (int x = 0; x < wallpaper.length; x++) {
          for (int y = 0; y < wallpaper[x].length(); y++) {
            char fileCheck = wallpaper[x].charAt(y);

            if (fileCheck == '#') {
              minX = Math.min(minX, x);
              minY = Math.min(minY, y);

              maxX = Math.max(maxX, x+1);
              maxY = Math.max(maxY, y+1);
            }
          }
        }

        return new int[]{minX, minY, maxX, maxY};
    }
}