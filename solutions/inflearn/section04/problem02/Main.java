package inflearn.section04.problem02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(solution(s1, s2));

    }
    public static String solution(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s1.length() != s2.length()) return "NO";

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) +1);
        }

        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x)) return "NO";
            map.put(x, map.get(x) - 1);

            if (map.get(x) == 0) map.remove(x);
        }

        if (map.size() == 0) return "YES";
        else return "NO";
    }
}
