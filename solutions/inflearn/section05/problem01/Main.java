package inflearn.section05.problem01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(solution(s));

    }
    public static String solution(String s) {
        Queue<Character> queue = new LinkedList<>();
        for (char x : s.toCharArray()) {
            if (x == '(') queue.add(x);
            else {
                if (queue.isEmpty()) return "NO";
                else if (queue.peek() == x) return "NO";
                else queue.remove();
            }
        }
        if (queue.size() == 0) return "YES";
        else return "NO";
    }
}
