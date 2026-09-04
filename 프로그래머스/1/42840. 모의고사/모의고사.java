import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] resolved = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                resolved[0]++;
            }
            if (answers[i] == second[i % second.length]) {
                resolved[1]++;
            }
            if (answers[i] == third[i % third.length]) {
                resolved[2]++;
            }
        }

        int max = Math.max(resolved[0], Math.max(resolved[1], resolved[2]));

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < resolved.length; i++) {
            if (resolved[i] == max) {
                answer.add(i + 1);
            }
        }

        int[] result = new int[answer.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}