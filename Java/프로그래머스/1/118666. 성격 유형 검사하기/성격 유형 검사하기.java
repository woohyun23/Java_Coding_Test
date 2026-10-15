import java.util.*;

// survey의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나입니다.
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
          char disagree = survey[i].charAt(0);
          char agree = survey[i].charAt(1);

          if (choices[i] < 4) scores.put(disagree, scores.getOrDefault(disagree, 0) + (4 - choices[i]));
          else scores.put(agree, scores.getOrDefault(agree, 0) + (choices[i] - 4));
        }

        StringBuilder answer = new StringBuilder();
        String[] types = {"RT", "CF", "JM", "AN"};

        for (String type : types) {
          char first = type.charAt(0);
          char second = type.charAt(1);

          int firstScore = scores.getOrDefault(first, 0);
          int secondScore = scores.getOrDefault(second, 0);

          if (firstScore >= secondScore) answer.append(first);
          else if (firstScore < secondScore) answer.append(second);
        }

        return answer.toString();
    }
}