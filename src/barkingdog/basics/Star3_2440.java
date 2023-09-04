package barkingdog.basics;

import java.util.Scanner;

public class Star3_2440 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i=0; i<N; i++) {
            for (int j=N; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
