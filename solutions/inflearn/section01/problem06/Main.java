package inflearn.section01.problem06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println( solution(input));
    }
    public static String solution(String input) {
        String res = "";

        for (char x : input.toCharArray()) {
            if (res.indexOf(x) == -1) res += x;
        }

        return res;
    }
}
