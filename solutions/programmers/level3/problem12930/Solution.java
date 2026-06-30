package programmers.level3.problem12930;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                idx = 0;
                sb.append(' ');
                continue;
            }
            if (idx % 2 == 0) sb.append(s.toUpperCase().charAt(i));
            else sb.append(s.toLowerCase().charAt(i));
            idx++;
        }
        return sb.toString();
    }
}