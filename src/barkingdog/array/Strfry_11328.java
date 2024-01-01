package barkingdog.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Strfry_11328 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i=0; i<N; i++) {
            int[] arr = new int[26];
            char[] str1 = in.next().toCharArray();
            char[] str2 = in.next().toCharArray();
            for (char c : str1) arr[c - 'a']++;
            for (char c : str2) arr[c - 'a']--;
            boolean flag = true;
            for (int var : arr) {
                if (var != 0) flag = false;
            }
            System.out.println(flag ? "Possible" : "Impossible");
        }
    }
}
