package inflearn.section01.problem08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        System.out.println(input.toUpperCase())
        System.out.println(solution(input.toUpperCase()));
    }
    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        for (char x : input.toCharArray()) {
            if (Character.isLetter(x)) sb.append(x);
            else continue;
        }

        if (sb.toString().equals(sb.reverse().toString())) return "YES";
        else return "NO";
    }
}