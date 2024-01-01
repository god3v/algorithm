package barkingdog.array;

import java.util.Scanner;

public class Anagram_1919 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[26];
        int count = 0;

        char[] str1 = in.nextLine().toCharArray();
        char[] str2 = in.nextLine().toCharArray();

        for (char c : str1) arr[c - 'a']++;
        for (char c : str2) arr[c - 'a']--;

        for (int i=0; i<arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
            if (arr[i] != 0)
                count += arr[i];
        }
        System.out.println(count);
    }
}
