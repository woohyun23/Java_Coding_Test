import java.util.*;

// 공원의 가로 길이가 W, 세로 길이가 H
// 공원의 좌측 상단의 좌표는 (0, 0), 우측 하단의 좌표는 (H - 1, W - 1)

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] start = new int[2];

        // 시작 지점 저장
        for (int x = 0; x < park.length; x++) {
          for (int y = 0; y < park[x].length(); y++) {
            if (park[x].charAt(y) == 'S') {
              start[0] = x;
              start[1] = y;
            }
          }
        }

        for (int i = 0; i < routes.length; i++) {
          String[] route = routes[i].split(" ");
          String direction = route[0];
          int size = Integer.parseInt(route[1]);

          boolean check = true;

          if (direction.equals("E")) {
            // 최종 위치가 오른쪽 경계를 벗어나는지 확인
            if (start[1] + size >= park[0].length()) check = false;

            for (int num = 1; check && num <= size; num++) {
              if (park[start[0]].charAt(start[1] + num) == 'X') {
                check = false;
                break;
              }
            }

            if (check) start[1] += size;
          } 
          else if (direction.equals("W")) {
            // 최종 위치가 오른쪽 경계를 벗어나는지 확인
            if (start[1] - size < 0) check = false;

            for (int num = 1; check && num <= size; num++) {
              if (park[start[0]].charAt(start[1] - num) == 'X') {
                check = false;
                break;
              }
            }

            if (check) start[1] -= size;
          } 
          else if (direction.equals("S")) {
            // 최종 위치가 오른쪽 경계를 벗어나는지 확인
            if (start[0] + size >= park.length) check = false;

            for (int num = 1; check && num <= size; num++) {
              if (park[start[0] + num].charAt(start[1]) == 'X') {
                check = false;
                break;
              }
            }

            if (check) start[0] += size;
          } 
          else if (direction.equals("N")) {
            // 최종 위치가 오른쪽 경계를 벗어나는지 확인
            if (start[0] - size < 0) check = false;

            for (int num = 1; check && num <= size; num++) {
              if (park[start[0] - num].charAt(start[1]) == 'X') {
                check = false;
                break;
              }
            }

            if (check) start[0] -= size;
          }
        }

        return start;
    }
}