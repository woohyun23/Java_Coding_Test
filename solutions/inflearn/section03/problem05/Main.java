package inflearn.section03.problem05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));

    }
    public static int solution(int n) {
        int cnt = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 1; rt <= (n/2) +1; rt++) {
            sum += rt;
            if (sum > n) {
                while (sum > n) {
                    sum -= lt;
                    lt++;
                }
            }
            if (sum == n) cnt++;
        }

        return cnt;
    }
}
