import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
          hash.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
          int callingIndex = hash.get(callings[i]);
          int frontIndex = callingIndex -1;

          String frontName = players[frontIndex];

          players[frontIndex] = callings[i];
          players[callingIndex] = frontName;

          hash.put(callings[i], frontIndex);
          hash.put(frontName, callingIndex);
        }

        return players;
    }
}