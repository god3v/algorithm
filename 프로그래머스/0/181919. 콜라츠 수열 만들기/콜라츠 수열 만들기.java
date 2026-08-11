import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int x = n;

        while (x != 1) {
            if (x % 2 == 0) {
                list.add(x);
                x = x / 2;
            }
            else if (x % 2 == 1) {
                list.add(x);
                x = 3 * x + 1;
            }
        }

        list.add(1);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}