import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        String[] split = myString.split("x");
        List<String> list = new ArrayList<>();

        for (String s : split) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }

        list.sort(null);
        return list.toArray(String[]::new);
    }
}