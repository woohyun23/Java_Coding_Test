package inflearn.section01.problem05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(solution(input));

    }
    public static String solution(String input) {
        char[] s = input.toCharArray();
        int lt = 0, rt = s.length - 1;
        while (lt < rt) {
            if (!Character.isLetter(s[lt])) {
                lt++;
            }
            else if (!Character.isLetter(s[rt])) {
                rt--;
            }
            else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        return new String(s);
    }
}
