package inflearn.section05.problem03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr, m, arr2));

    }
    public static int solution(int n, int[][] arr, int m, int[] arr2) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int x : arr2) {
            for (int i = 0; i < n; i++) {
                if (arr[i][x-1] > 0) {
                    if (!stack.isEmpty() && stack.peek() == arr[i][x-1]) {
                        res += 2;
                        stack.pop();
                        arr[i][x-1] = 0;
                        break;
                    }
                    stack.push(arr[i][x-1]);
                    arr[i][x-1] = 0;
                    break;
                }
                else continue;
            }
        }
        return res;
    }
}
