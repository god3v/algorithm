package barkingdog.basics;

import java.util.Scanner;

public class Star2_2439 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i=1; i<=N; i++) {
            for (int j=N; j>0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
