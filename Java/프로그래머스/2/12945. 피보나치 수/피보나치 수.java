import java.util.*;

class Solution {
  public int solution(int n) {
    int MOD = 1234567;

    // prev는 pivot(0), curr은 pivot(1) 값으로 설정
    int prev = 0; 
    int curr = 1;
    
    for (int i = 2; i <= n; i++) {
      int next = (prev + curr) % MOD;
      prev = curr;
      curr = next;
    }

    return  curr;
  }
}