import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 사용자별 결과 메일 횟수
        Map<String, Integer> mailCount = new HashMap<>();
        
        for (String id : id_list) {
            mailCount.put(id, 0);
        }
        
        // 동일한 사용자가 같은 사용자를 신고한 중복 기록 제거
        Set<String> uniqueReports = new HashSet<>(Arrays.asList(report));

        // for (String key : hash.keySet()) {
        //     System.out.println("key : " + key + ", value : " + hash.get(key));
        // }
        
        // 사용자별 신고당한 횟수
        Map<String, Integer> reportedCount = new HashMap<>();
        
        // 신고 횟수 카운트
        for (String reportEntry : uniqueReports) {
            String[] parts = reportEntry.split(" ");
            String reportedUser = parts[1];
            
            reportedCount.put(reportedUser, reportedCount.getOrDefault(reportedUser, 0) +1);
        }
        
        // 메일 전송 횟수 카운트
        for (String reportEntry : uniqueReports) {
            String[] parts = reportEntry.split(" ");
            String reporter = parts[0];
            String reportedUser = parts[1];
            
            if (reportedCount.get(reportedUser) >= k) mailCount.put(reporter, mailCount.get(reporter) +1);
        }
        
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.get(id_list[i]);
        }
        return answer;
    }
}