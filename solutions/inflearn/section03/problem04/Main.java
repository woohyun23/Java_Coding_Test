package inflearn.section03.problem04;

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
        int sum = 0;
        int cnt = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            while (sum > m) {
                sum -= arr[lt];
                lt++;
            }
            if (sum == m) cnt++;
        }
        return cnt;
    }
}
