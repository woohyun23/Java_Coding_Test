import java.util.*;

class Solution {
    public String solution(String s) {
        // -1을 지정해 문자열 끝의 공백도 보존
        String[] words = s.split(" ", -1);

        for (int i = 0; i < words.length; i++) {
          if (words[i].isEmpty()) continue;

          char[] word = words[i].toCharArray();

          if (Character.isLetter(word[0])) word[0] = Character.toUpperCase(word[0]);

          for (int j = 1; j < word.length; j++) {
            if (Character.isLetter(word[j])) word[j] = Character.toLowerCase(word[j]);
          }

          words[i] = new String(word);
        }

        return String.join(" ", words);
    }
}