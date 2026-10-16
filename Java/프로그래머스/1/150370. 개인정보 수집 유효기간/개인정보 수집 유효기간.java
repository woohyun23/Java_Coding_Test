import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();

        for (String term : terms) {
          String[] termsSep = term.split(" ");
          map.put(termsSep[0], Integer.parseInt(termsSep[1]));
        }

        // for (String key : hash.keySet()) {
        //   System.out.println("[Key]:" + key + " [Value]:" + hash.get(key));
        // }

        int todayValue = convertToDays(today);
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
          String[] privaciesSep = privacies[i].split(" ");

          String saveDate = privaciesSep[0];
          String key = privaciesSep[1];
          
          int savedDateValue = convertToDays(saveDate);
          int termMonths = map.get(key);

          int expriationDateValue = savedDateValue + termMonths * 28;

          if (todayValue >= expriationDateValue) {
            res.add(i+1);
          }
        }

        int[] answer = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
          answer[i] = res.get(i);
        }

        return answer;
    }

    private int convertToDays(String date) {
      String[] dateSep = date.split("\\.");

      int year = Integer.parseInt(dateSep[0]);
      int month = Integer.parseInt(dateSep[1]);
      int day = Integer.parseInt(dateSep[2]);

      return year * 12 * 28 + month * 28 + day;
    }
}