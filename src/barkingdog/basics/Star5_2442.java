package barkingdog.basics;

import java.util.Scanner;

public class Star5_2442 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i=1; i<=N; i++) {
            for (int j=N+i-1; j>0; j--) {
                if (j <= i*2-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
