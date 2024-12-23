import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 1. N값 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2. 길이 N의 숫자를 입력 받아 String 형 변수 sNum에 저장하기
        String sNum = br.readLine();

        // 3. sNum을 다시 char []형 변수 cNum에 변환하여 저장하기
        char[] cNum = sNum.toCharArray();

        // 4. int형 변수 sum 선언하기
        int sum = 0;

        // 5. for(cNum 길이만큼 반복) { 배열의 각 자릿값을 정수형으로 변환하여 sum에 더하여 누적하기 }
        for (int i=0; i<cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        // 6. sum 출력하기
        System.out.println(sum);
    }
}
