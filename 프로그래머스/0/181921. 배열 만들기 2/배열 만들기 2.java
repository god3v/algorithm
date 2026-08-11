import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(5);

        while(!queue.isEmpty()) {
            int now = queue.poll();

            if (now >= l) {
                list.add(now);
            }

            int nextZero = now * 10;
            int nextZeroFive = now * 10 + 5;

            if (nextZero <= r) {
                queue.offer(nextZero);
            }

            if (nextZeroFive <= r) {
                queue.offer(nextZeroFive);
            }
        }

        if (list.isEmpty()) return new int[]{-1};

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}