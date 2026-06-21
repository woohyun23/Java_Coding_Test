package inflearn.section03.problem06;

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
        int zero_cnt = 0;
        int cnt = 0;
        int res= 0;
        int lt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero_cnt++;
                res = Math.max(res, cnt);
                while (zero_cnt > m) {
                    if (arr[lt] == 0) {
                        cnt--;
                        zero_cnt--;
                    }
                    else cnt--;
                    lt++;
                }
            }
            cnt++;
        }
        return res;
    }
}
