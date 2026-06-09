package inflearn.section01.problem09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }
    public static int solution(String input) {
        String res = "";

        for (char x : input.toCharArray()) {
            if (Character.isDigit(x)) res += x;
        }

        return Integer.parseInt(res);
    }
}
