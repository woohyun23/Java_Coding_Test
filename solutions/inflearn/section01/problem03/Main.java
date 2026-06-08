package inflearn.section01.problem03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(solution(input));

    }
    public static String solution(String input) {

        String[] arr = input.split(" ");
        String res = "";

        for (String x : arr) {
            if (x.length() > res.length()) res = x;
        }
        return res;

    }
}
