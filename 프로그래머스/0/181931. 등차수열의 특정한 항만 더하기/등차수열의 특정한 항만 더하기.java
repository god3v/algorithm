class Solution {
        public int solution(int a, int d, boolean[] included) {
        /**
         * 첫째항 a
         * 공차 d
         * 길이 N Boolean[] included
         *
         * int answer = 0;
         * for (included[] 만큼 반복)
         *      if (included[i])
         *          answer += a
         *      a += d
         * answer 출력
         */

        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (d * i);
            }
        }
        return answer;
    }
}