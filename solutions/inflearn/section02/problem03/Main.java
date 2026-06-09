package inflearn.section02.problem03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        solution(n, arr1, arr2);

    }
    public static void solution(int n, int[] arr1, int[] arr2) {
        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr2[i]) System.out.println("D");
            else if (arr1[i] - arr2[i] == -2 || arr1[i] - arr2[i] == 1) System.out.println("A");
            else System.out.println("B");
        }

    }
}
