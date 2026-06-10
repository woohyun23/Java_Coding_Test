package inflearn.section02.problem09;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
    public static int solution(int n, int[][] arr) {
        int res = 0;
        // 가로
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                temp += arr[j][i];
            }
            if (temp > res) res = temp;
        }

        // 세로
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                temp += arr[i][j];
            }
            if (temp > res) res = temp;
        }

        // 대각선 좌 -> 우
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp += arr[i][i];
        }
        if (temp > res) res = temp;

        // 대각선 우 -> 좌
        temp = 0;
        for (int i = 0; i < n; i++) {
            temp += arr[i][n - i - 1];
        }
        if (temp > res) res = temp;

        return res;
    }
}
