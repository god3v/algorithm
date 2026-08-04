class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            int before = numLog[i - 1];
            int current = numLog[i];
            if (numLog[i - 1] + 1 == current) {
                answer.append("w");
            }
            else if (numLog[i - 1] - 1 == current) {
                answer.append("s");
            }
            else if (numLog[i - 1] + 10 == current) {
                answer.append("d");
            }
            else if (numLog[i - 1] - 10 == current) {
                answer.append("a");
            }
        }

        return answer.toString();
    }
}