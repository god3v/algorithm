package barkingdog.basics;

import java.util.Scanner;

public class Star9_2446 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i=1; i<=N; i++) {
            for (int j=1; j<=2*N-i; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i=1; i<N; i++) {
            for (int j=1; j<=N+i; j++) {
                if (j >= N-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
