import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 데이터 개수
        // L: 최솟값 구하는 범위
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        // Deque<Node> (데이터 담을 덱 자료구조)
        Deque<Node> deque = new LinkedList<>();

        // for (N)
        // now: 현재 값
        // 1. 덱의 마지막 위치에서 now 보다 큰 값 덱에서 제거
        // 2. 덱의 마지막 위치에 now값 저장
        // 3. 덱의 첫 번째 위치에서부터 L의 범위를 벗어난 값 (now index-L <= index) 덱에서 제거
        // 4. 덱의 1번째 데이터 출력
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }

            deque.addLast(new Node(i, now));

            if (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }
            bw.write(deque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }

    // 덱에 저장할 노드 클래스 생성
    // 필드: index, value
    static class Node {
        public int index;
        public int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}