class Solution {
    public String solution(String my_string, int[][] queries) {

        String answer = my_string;

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            String forward = answer.substring(0, s);
            String temp = answer.substring(s, e + 1);
            String behind = answer.substring(e + 1);

            String reversed = new StringBuilder(temp).reverse().toString();

            answer = forward + reversed + behind;
        }
        return answer;
    }
}