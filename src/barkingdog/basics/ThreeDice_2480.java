package barkingdog.basics;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThreeDice_2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int money = 0;

        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            money = 10000 + (arr[0] * 1000);
        } else if (arr[0] != arr[1] && arr[1] != arr[2]) {
            money = arr[2] * 100;
        } else {
            if (arr[0] == arr[1]) {
                money = 1000 + (arr[0] * 100);
            } else {
                money = 1000 + (arr[1] * 100);
            }
        }
        System.out.println(money);
    }
}
