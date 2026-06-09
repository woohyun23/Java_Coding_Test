package inflearn.section01.problem11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(solution(input));

    }
    public static String solution(String input) {
        String res = "";
        input = input + " ";
        int cnt = 1;

        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == input.charAt(i+1)) cnt++;
            else {
                if (cnt == 1) res += input.charAt(i);
                else {
                    res += input.charAt(i);
                    res += cnt;
                }

                cnt = 1;
            }
        }
        return res;
    }
}
