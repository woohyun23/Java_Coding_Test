package inflearn.section01.problem01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        System.out.println(solution(input, c));
        sc.close();
    }

    public static int solution(String input, char c) {
        int res = 0;
        char target = Character.toUpperCase(c);

        for (char x : input.toCharArray()) {
            if (Character.toUpperCase(x) == target) {
                res++;
            }
        }
        return res;
    }
}
