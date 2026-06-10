package inflearn.section02.problem10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        for (int i = 0; i < n+1; i++) {
            arr[i][0] = 0;
            arr[0][i] = 0;

        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n+1; i++) {
            arr[n+1][i] = 0;
            arr[i][n+1] = 0;
        }
        System.out.println(solution(n, arr));
    }
    public static int solution(int n, int[][] arr) {
        int cnt = 0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j]
                && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
