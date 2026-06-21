package inflearn.section04.problem01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(solution(n, s));
    }
    public static char solution(int n, String s) {
        int[] temp = new int[5];
        int res = 0;
        int tp = 0;
        for (char x : s.toCharArray()) {
            temp[x - 'A']++;
        }

        for (int i = 0; i < 5; i++) {
            if (temp[i] > tp) {
                tp = temp[i];
                res = i;
            }
        }
        res += 'A';
        return (char) res;
    }
}
