class Solution {
    public int solution(int a, int b, int c) {
        /*
        if (a != b != c)
            answer = (a + b + c)
        else if (a == b == c)
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c)) * ((a * a * a) + (b * b * b) + (c * c * c))
        else
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c))
         */

        int sum1 = a + b + c;
        int sum2 = (a * a) + (b * b) + (c * c);
        int sum3 = (a * a * a) + (b * b * b) + (c * c * c);

        int answer;

        if (a != b && b != c && c != a)
            answer = sum1;
        else if (a == b && a == c)
            answer = sum1 * sum2 * sum3;
        else 
            answer = sum1 * sum2;
        
        return answer;
    }
}