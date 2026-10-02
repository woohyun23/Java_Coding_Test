class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String sound : babbling) {
            boolean consecutive = false;
            
            // 같은 발음이 연속되는지 확인
            for (String word : words) {
                if (sound.contains(word + word)) {
                    consecutive = true;
                    break;
                }
            }
            
            if (consecutive) {
                continue;
            }
            
            // 발음을 공백으로 치환
            for (String word : words) {
                sound = sound.replace(word, " ");
            }
            
            // 발음 외의 문자가 남지 않았다면 발음 가능한 단어
            if (sound.replace(" ", "").isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}