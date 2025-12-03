/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1546                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: sooon9254 <boj.kr/u/sooon9254>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1546                           #+#        #+#      #+#    */
/*   Solved: 2025/12/03 19:18:06 by sooon9254     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

       // 1. 과목의 개수 N이 주어진다. N <= 1000
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());

       // 2. 현재 성적이 주어진다. 0 < score <= 100
       int max = 0;
       int sum = 0;

       // N만큼 배열에 점수를 초기화하고, 가장 높은 점수 값을 구한다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            if (score > max) max = score;
            sum += score;
        }

       // 3. 새로운 평균을 출력한다.
       // 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하
        System.out.println(sum * 100.0 / max / N);

    }
}
