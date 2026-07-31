class Solution {
    public String solution(String myString) {
        /*
            입력
            - 문자열 myString

            출력
            - 변환된 문자열

            초기화
            - answer = "";

            구현
            for (char c: String)
                if (c == 'a')
                    result += 'A'
                else if (c 가 대문자 && c != 'A')
                    result += toLowerCase(c)
                else
                    result += c
            return result
         */
        StringBuilder answer = new StringBuilder();

        for (char c: myString.toCharArray()) {
            if (c == 'a')
                answer.append('A');
            else if (Character.isUpperCase(c) && c != 'A')
                answer.append(Character.toLowerCase(c));
            else
                answer.append(c);
        }

        return answer.toString();
    }
}