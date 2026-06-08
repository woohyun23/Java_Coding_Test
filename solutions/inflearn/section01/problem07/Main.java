package inflearn.section01.problem07;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input.toUpperCase()));
    }
    public static String solution(String input) {
        String reverse = new StringBuilder(input).reverse().toString();
        if (input.equals(reverse)) return "YES";
        else return "NO";
    }
}
