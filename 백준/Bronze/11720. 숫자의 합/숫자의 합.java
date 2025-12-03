/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11720                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: sooon9254 <boj.kr/u/sooon9254>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11720                          #+#        #+#      #+#    */
/*   Solved: 2025/12/03 18:48:47 by sooon9254     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // 1. 첫째 줄에 숫자 N이 주어진다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 배열 생성
        int[] arr = new int[N];

        // 2. 둘째 줄에 숫자 N개가 공백 없이 주어진다.
        String numbers = br.readLine();

        // 3. 입력으로 주어진 숫자 N개의 합을 출력한다.
        // 배열에 주어진 숫자를 차례로 초기화한다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numbers.charAt(i) - '0';
        }

        // 배열을 순회하며 합계를 구한다.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // 합계를 출력한다.
        System.out.println(sum);
    }
}
