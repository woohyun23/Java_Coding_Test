
class Solution {
    public String solution(String X, String Y) {
        int[] X_arr = new int[10];
        int[] Y_arr = new int[10];
        
        for (char x : X.toCharArray()) {
            X_arr[x - '0']++;
        }
        for (char y : Y.toCharArray()) {
            Y_arr[y - '0']++;
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int num = 9; num >= 0; num--) {
            int cnt = Math.min(X_arr[num], Y_arr[num]);
            for (int i = 0; i < cnt; i++) {
                answer.append(num);
            }
        }
        
        if (answer.length() == 0) return "-1";
        
        if (answer.charAt(0) == '0') return "0";
        
        return answer.toString();
    }
}