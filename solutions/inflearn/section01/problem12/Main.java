package inflearn.section01.problem12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        int[] res = solution(num, str);

        for (int i = 0; i < num; i++) {
            System.out.print((char) res[i]);
        }
    }
    public static int[] solution(int num, String str) {
        String[] arr = new String[num];
        int[] res = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = str.substring(0, 7);
            arr[i] = arr[i].replace('#', '1').replace('*', '0');

            str = str.substring(7);
        }

        for (int i = 0; i < num; i++) {
            res[i] = Integer.parseInt(arr[i], 2);
        }

        return res;
    }
}
