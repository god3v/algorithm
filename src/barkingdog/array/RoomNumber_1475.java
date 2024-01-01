package barkingdog.array;

import java.util.Scanner;

public class RoomNumber_1475 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = Integer.toString(in.nextInt());
        int[] arr = new int[10];
        int max = 0;

        for (int i=0; i<str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }

        int k = arr[6] + arr[9];
        if (k % 2 == 0) {
            arr[6] = arr[6] / 2;
            arr[9] = arr[9] / 2;
        } else {
            arr[6] = arr[6] / 2 + 1;
            arr[9] = arr[9] / 2 + 1;
        }

        for (int var : arr) {
            max = Math.max(max, var);
        }

        System.out.println(max);
    }
}
