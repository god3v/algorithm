package barkingdog.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RatePlan_1267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());
        int Y = 0;
        int M = 0;

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<cnt; i++) {
            int sec = Integer.parseInt(st.nextToken());

            Y += ((sec / 30) + 1) * 10;
            M += ((sec / 60) + 1) * 15;
        }

        if (Y > M) {
            System.out.println("M " + M);
        } else if (Y < M){
            System.out.println("Y " + Y);
        } else {
            System.out.println("Y M " + M);
        }
    }
}
