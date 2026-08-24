import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        ArrayList<String> list = new ArrayList<>();

        int idx = 0;
        for (int i = m; i <= my_string.length(); i = i + m) {
            String temp = my_string.substring(idx, i);
            list.add(temp);
            idx = idx + m;
        }

        StringBuilder sb = new StringBuilder();
        for (String temp : list) {
            sb.append(temp.charAt(c - 1));
        }

        return sb.toString();
    }
}