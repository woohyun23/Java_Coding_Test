class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        
        for (int num : intArr) {
            minNum = Math.min(num, minNum);
            maxNum = Math.max(num, maxNum);
        }
        
        String answer = minNum + " " + maxNum;
        return answer;
    }
}