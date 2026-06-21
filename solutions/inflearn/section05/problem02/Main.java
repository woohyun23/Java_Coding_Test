package inflearn.section05.problem02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(solution(input));
    }
    public static String solution(String input) {
        Queue<Character> q = new LinkedList<>();
        String res = "";
        for (char x : input.toCharArray()) {
            if (x == '(') q.add(x);
            else if (x == ')') q.remove();
            else if (q.size() == 0) res += x;

        }

        return res;
    }
}
