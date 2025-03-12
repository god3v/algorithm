import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] checkArr = new int[4];
    static int[] myArr = new int[4];
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        // 문자열 길이 S, 비밀번호 길이 P 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // 문자열 A 입력 받기
        st = new StringTokenizer(br.readLine());
        char[] A = st.nextToken().toCharArray();

        // 비밀번호 체크 배열
        st = new StringTokenizer(br.readLine());

        int result = 0; // 가능한 비밀번호 수

        for (int i = 0; i < checkArr.length; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) checkSecret++;
        }

        // 초기 P 부분 문자열 처리
        for (int i = 0; i < P; i++) {
            add(A[i]);
        }

        if (checkSecret == 4)
            result++;

        for (int i = P; i < S; i ++) {
            int j = i - P;
            add(A[i]);
            remove(A[j]);
            if (checkSecret == 4)
                result++;
        }

        System.out.println(result);
        br.close();
    }

    private static void add(char c) {
        switch (c) {
            case 'A' -> {
                myArr[0]++;
                if (checkArr[0] == myArr[0])
                    checkSecret++;
            }
            case 'C' -> {
                myArr[1]++;
                if (checkArr[1] == myArr[1])
                    checkSecret++;
            }
            case 'G' -> {
                myArr[2]++;
                if (checkArr[2] == myArr[2])
                    checkSecret++;
            }
            case 'T' -> {
                myArr[3]++;
                if (checkArr[3] == myArr[3])
                    checkSecret++;
            }
        }
    }

    private static void remove(char c) {
        switch (c) {
            case 'A' -> {
                if (checkArr[0] == myArr[0])
                    checkSecret--;
                myArr[0]--;
            }
            case 'C' -> {
                if (checkArr[1] == myArr[1])
                    checkSecret--;
                myArr[1]--;
            }
            case 'G' -> {
                if (checkArr[2] == myArr[2])
                    checkSecret--;
                myArr[2]--;
            }
            case 'T' -> {
                if (checkArr[3] == myArr[3])
                    checkSecret--;
                myArr[3]--;
            }
        }
    }
}

