package programmers.problem12948;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String temp = phone_number.substring(phone_number.length() - 4);
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += temp;
        return answer;
    }
}