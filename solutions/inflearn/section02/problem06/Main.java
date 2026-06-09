package inflearn.section02.problem06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solution(n, arr);
    }
    public static void solution(int n, int[] arr) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            String temp = String.valueOf(arr[i]);
            StringBuilder sb = new StringBuilder(temp).reverse();
            if(Integer.parseInt(sb.toString()) == 1) continue;
            int cnt = 0;
            for (int j = 1 ; j <= Math.sqrt(Integer.parseInt(sb.toString())); j++) {
                if (Integer.parseInt(sb.toString()) % j == 0) cnt++;
            }

            if (cnt == 1) {
                System.out.print(Integer.parseInt(sb.toString()) + " ");
            }
        }
    }
}
