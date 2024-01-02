package barkingdog.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Josephus_1158 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int K = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        ListIterator<Integer> iter = list.listIterator();

        for (int i=1; i<=N; i++) {
            list.add(i);
        }

        sb.append("<");

        int idx = 0;
        while (list.size() > 1) {
            idx = (idx + (K - 1)) % list.size();

            sb.append(list.remove(idx)).append(", ");
        }

        sb.append(list.remove()).append(">");
        System.out.println(sb);
    }
}
