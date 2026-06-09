package inflearn.section02.problem04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = solution(n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static int[] solution(int n) {
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 1;

        for (int i = 2; i < n; i++) {
            res[i] = res[i-1] + res[i-2];
        }

        return res;
    }
}
