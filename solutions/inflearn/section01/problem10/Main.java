package inflearn.section01.problem10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input  = sc.next();
        char c = sc.next().charAt(0);

        int[] res = solution(input, c);

        for (int i = 0; i < input.length(); i++) {
            if (i == input.length()-1) System.out.print(res[i]);
            else System.out.print(res[i] + " ");
        }

    }
    public static int[] solution(String input, char c) {
        int cnt = 1000;
        int[] res = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != c) cnt++;
            else cnt = 0;

            res[i] = cnt;
        }

        cnt = 1000;
        for (int i = input.length()-1; i >= 0; i--) {
            if(input.charAt(i) != c) cnt++;
            else cnt = 0;

            res[i] = Math.min(res[i], cnt);
        }
        return res;
    }
}
