package inflearn.section04.problem04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(solution(s1, s2));

    }
    public static int solution(String s1, String s2) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            for (char x : s2.toCharArray()) {
                hash.put(x, hash.getOrDefault(x, 0) + 1);
            }
            for (int j = i; j < i + s2.length(); j++) {
                if (hash.containsKey(s1.charAt(j))) {
                    hash.put(s1.charAt(j), hash.get(s1.charAt(j)) - 1);
                    if (hash.get(s1.charAt(j)) == 0) hash.remove(s1.charAt(j));
                }
                else break;

            }

            if (hash.size() == 0) {
                cnt++;
            }
            hash.clear();
        }

        return cnt;
    }
}
