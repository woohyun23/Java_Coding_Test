package programmers.level1.problem12947;

class Solution {
    public boolean solution(int input) {
        boolean res = true;
        int temp = 0;
        String s = String.valueOf(input);
        for (char x : s.toCharArray()) {
            temp += Integer.parseInt(String.valueOf(x));
        }

        if (input % temp != 0) res = false;
        return res;
    }

}
