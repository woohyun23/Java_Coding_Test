package inflearn.section02.problem12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, m, arr));
    }
    public static int solution(int n, int m, int[][] arr) {
        int[][] rank = new int[m][n+1];
        int cnt = 0;

//        해당 학생 번호에 등수 입력
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rank[i][arr[i][j]] = j;
            }
        }

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n+1; j++) {
//                System.out.print(rank[i][j] + " ");
//            }
//            System.out.println();
//        }

//        mentor, mentee 카운트
        for (int mentor = 1; mentor <= n; mentor++) {
            for (int mentee = 1; mentee <= n; mentee++) {
                if (mentor == mentee) continue;
                boolean flag = true;

                for (int test = 0; test < m; test++) {
                    if (rank[test][mentor] < rank[test][mentee]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) cnt++;
            }
        }

        return cnt;
    }
}
