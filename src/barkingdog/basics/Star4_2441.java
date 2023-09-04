package barkingdog.basics;

import java.util.Scanner;

public class Star4_2441 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (i>j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
