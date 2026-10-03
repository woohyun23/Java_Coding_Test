class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n + 1];

        // 모든 학생은 기본적으로 체육복을 1벌 가지고 있다.
        for (int student = 1; student <= n; student++) {
            clothes[student] = 1;
        }

        // 체육복을 도난당한 학생
        for (int student : lost) {
            clothes[student]--;
        }

        // 여벌 체육복이 있는 학생
        for (int student : reserve) {
            clothes[student]++;
        }

        // 앞번호 학생부터 체육복을 빌린다.
        for (int student = 1; student <= n; student++) {
            if (clothes[student] == 0) {
                if (student > 1 && clothes[student - 1] == 2) {
                    clothes[student - 1]--;
                    clothes[student]++;
                } else if (student < n && clothes[student + 1] == 2) {
                    clothes[student + 1]--;
                    clothes[student]++;
                }
            }
        }

        int answer = 0;

        for (int student = 1; student <= n; student++) {
            if (clothes[student] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}