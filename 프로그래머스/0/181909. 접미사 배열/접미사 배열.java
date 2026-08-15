import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);
        
        return answer;
    }
}