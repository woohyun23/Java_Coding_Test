package programmers.level2.problem82612;

import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        int idx = 1;
        while(count > 0) {
            total -= price * idx++;
            count--;
        }

        if (money + total >= 0) return 0;
        else return (money  + total) * -1;
    }
}
