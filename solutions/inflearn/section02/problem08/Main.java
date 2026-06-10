package inflearn.section02.problem08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = solution(n, arr);
        for (int x : res) System.out.print(x + " ");
    }
    public static int[] solution(int n, int[] arr) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) res[i] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) res[i]++;
            }
        }

        return res;
    }
}
