package barkingdog.basics;

import java.util.Scanner;

public class Star8_2445 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i=0; i<N; i++) {
            for (int j=2*N; j>0; j--) {
                if (j <= i+1 || j >= 2*N-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i=1; i<N; i++) {
            for (int j=2*N; j>0; j--) {
                if (j <= N-i || j > N+i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
