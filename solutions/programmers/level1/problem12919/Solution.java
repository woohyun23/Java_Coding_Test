package programmers.level1.problem12919;

class Solution {
    public String solution(String[] seoul) {
        int cnt = 0;
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) break;
            cnt++;
        }

        return "김서방은 " + cnt + "에 있다";
    }
}
