package barkingdog.basics;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CardUpsideDown_10804 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] arr = new int[20];
        for (int i=0; i<20; i++) {
            arr[i] = i+1;
        }

        for (int i=0; i<10; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int temp;
            for (int j=0; j<(end-start+1)/2; j++) {
                temp = arr[start + j];
                arr[start + j] = arr[end - j];
                arr[end - j] = temp;
            }
        }
        for (int i=0; i<20; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
