class Solution {
    public int solution(String number) {
        int remainder = 0;

        for (char c : number.toCharArray()) {
            int num = c - '0';

            remainder += (num % 9);
        }

        return remainder % 9;
    }
}