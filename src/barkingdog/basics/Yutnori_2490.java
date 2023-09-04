package barkingdog.basics;

import java.io.*;
import java.util.StringTokenizer;

public class Yutnori_2490 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int zeroCnt = 0;
        int oneCnt = 0;

        for (int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<4; j++) {
                if (Integer.parseInt(st.nextToken()) != 0) {
                    oneCnt++;
                }
            }
            if (oneCnt == 0) {
                System.out.println("D");
            } else if (oneCnt == 1) {
                System.out.println("C");
            } else if (oneCnt == 2) {
                System.out.println("B");
            } else if (oneCnt == 3) {
                System.out.println("A");
            } else {
                System.out.println("E");
            }

            oneCnt = 0;
        }
    }
}
