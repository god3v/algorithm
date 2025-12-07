/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10808                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: sooon9254 <boj.kr/u/sooon9254>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10808                          #+#        #+#      #+#    */
/*   Solved: 2025/12/07 22:10:16 by sooon9254     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // 1. 단어 S가 주어진다. S.length() < 100, 소문자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        // a-z의 개수를 담을 수 있는 배열 생성
        int[] arr = new int[26];

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            arr[c - 97] += 1;
        }

        // 2. 단어에 포함되어 있는 a-z까지의 개수를 공백으로 구분하여 출력한다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : arr) {
            bw.append(i + " ");
        }
        bw.flush();
        bw.close();
    }
}
