package inflearn.section05.problem04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));

    }
    public static int solution(String input) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int first = 0, last = 0;
        for (char x : input.toCharArray()) {
            if (x >= '0' && x <= '9') stack.add(Integer.parseInt(Character.toString(x)));
            else {
                if (x == '+') {
                    first = stack.pop();
                    last = stack.pop();
                    stack.add(last + first);
                }
                else if (x == '-') {
                    first = stack.pop();
                    last = stack.pop();
                    stack.add(last - first);
                }
                else if (x == '*') {
                    first = stack.pop();
                    last = stack.pop();
                    stack.add(last * first);
                }
                else if (x == '/') {
                    first = stack.pop();
                    last = stack.pop();
                    stack.add(last / first);
                }
            }
        }

        return stack.pop();
    }
}
