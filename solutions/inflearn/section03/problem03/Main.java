package inflearn.section03.problem03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));

    }
    public static int solution(int n, int m, int[] arr) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        res = sum;

        for (int i = m; i < n; i++) {
            sum -= arr[i-m];
            sum += arr[i];
            res = Math.max(res, sum);
        }

        return res;
    }
}
