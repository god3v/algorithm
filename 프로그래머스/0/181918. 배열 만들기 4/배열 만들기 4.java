import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            while (!deque.isEmpty() && deque.peekLast() >= arr[i]) {
                deque.pollLast();
            }
            deque.addLast(arr[i]);
        }

        int[] stk = new int[deque.size()];
        for (int i = 0; i < stk.length; i++) {
            if (!deque.isEmpty())
                stk[i] = deque.pollFirst();
        }
        return stk;
    }
}