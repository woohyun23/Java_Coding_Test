package programmers.level2.problem68935;


class Solution {
    public int solution(int num) {
        String temp = getReversedTernary(num);

        int res = 0;
        for (int i = 0; i < temp.length(); i++) {
            int digit = temp.charAt(i) - '0';
            res = res * 3 + digit;
        }

        return res;
    }

    public String getReversedTernary(int num){
        String res = "";
        while (num > 2) {
            res += num % 3;
            num /= 3;
        }
        res += num;

        return res;
    }
}

