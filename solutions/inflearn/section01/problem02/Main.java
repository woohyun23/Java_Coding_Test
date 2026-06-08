package inflearn.section01.problem02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println( solution(input));
    }
    public static String solution(String input) {
        String res = "";

        for(char x : input.toCharArray()) {
            if (Character.isUpperCase(x)) {
                res += Character.toLowerCase(x);
            }
            else res += Character.toUpperCase(x);
        }

        return res;
    }
}
