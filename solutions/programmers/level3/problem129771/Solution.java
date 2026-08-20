package programmers.level3.problem129771;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int num1 = 0; num1 < nums.length; num1++) {
            for (int num2 = num1 + 1; num2 < nums.length; num2++) {
                for (int num3 = num2 + 1; num3 < nums.length; num3++) {
                    int temp = nums[num1] + nums[num2] + nums[num3];
                    int cnt = 0;
                    for (int i = 2; i <= Math.sqrt(temp); i++) {
                        if (temp % i == 0) {
                            cnt++;
                            break;
                        }
                    }
                    if (cnt == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
