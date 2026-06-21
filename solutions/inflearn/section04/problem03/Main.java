package inflearn.section04.problem03;

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
        int[] res = solution(n, m, arr);
        for (int x : res) System.out.print(x + " ");
    }
    public static int[] solution(int n, int m, int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < m; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }
        int[] res = new int[n-m+1];
        int index = 0;
        res[index++] = hash.size();

        for (int i = m; i < n; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
            hash.put(arr[i-m], hash.getOrDefault(arr[i-m], 0) - 1);
            if (hash.get(arr[i-m]) == 0) hash.remove(arr[i-m]);
            res[index++] = hash.size();
        }
        return res;
    }
}
