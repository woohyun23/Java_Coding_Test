package inflearn.section02.problem07;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));

    }
    public static int solution(int n, int[] arr) {
        int cnt = 0;
        int plus = 0;
        for (int x : arr) {
            if (x == 1) {
                plus++;
                cnt += plus;
            }
            else plus = 0;

        }

        return cnt;
    }
}
