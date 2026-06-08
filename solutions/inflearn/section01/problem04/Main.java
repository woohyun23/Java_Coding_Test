package inflearn.section01.problem04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        solution(n, arr);
    }
    public static int solution(int n, String[] arr) {
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            System.out.println(sb.reverse());
        }

        return 0;
    }
}
