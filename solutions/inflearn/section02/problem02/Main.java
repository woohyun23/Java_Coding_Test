package inflearn.section02.problem02;

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
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                cnt++;
                max = arr[i];
            }
        }

        return cnt;
    }
}
